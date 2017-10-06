package com.awana.patrickrobichaud.awanamanager.Record;

import java.util.ArrayList;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class SectionsStore implements IRecordStore {
    public Sections GetSection(Book book, Chapter chapter, Section section)
    {
        for(int i = 0; i < _section.size(); ++i)
        {
            if(_section.get(i).GetBook() == book)
                if(_section.get(i).GetChapter() == chapter)
                    if(_section.get(i).GetSection() == section)
                        return _section.get(i);
        }
        return null;
    }
    public ArrayList<Sections> GetCumulativeRecord(Book book)
    {
        // TODO need class describing total completion of a book. return that instead.
        return _section;
    }
    public void AddRecord(Sections section)
    {
        _section.add(section);
    }
    public void DeleteRecord(Book book, Chapter chapter, Section section)
    {
        for(int i = 0; i < _section.size(); ++i)
        {
            if(_section.get(i).GetBook() == book)
                if(_section.get(i).GetChapter() == chapter)
                    if(_section.get(i).GetSection() == section) {
                        _section.remove(i);
                        return;
                    }
        }
    }

    public Boolean CheckIfConsecutive() {
        Sections previous = _section.get(0);
        int total = 0;

        for(int i = 0; i < _section.size(); ++i)
        {
        if (_section.get(i).GetBook() == previous.GetBook())
            if (_section.get(i).GetChapter() == previous.GetChapter())
                if (_section.get(i).GetSection() == previous.GetSection()) {
                    total++;
                    previous = _section.get(i);
                    continue;
                }
                // TODO once Section clas is defined, compare with the first enum element.
                else if(false)//_section.get(i).GetSection() == 0)
                {
                    total++;
                    previous = _section.get(i);
                    continue;
                }
                else
                    return false;
        }
    }

    private ArrayList<Sections> _section;
}
