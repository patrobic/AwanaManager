package com.awana.patrickrobichaud.awanamanager.Record;

import com.awana.patrickrobichaud.awanamanager.Entity.EntityBase;
import com.awana.patrickrobichaud.awanamanager.Entity.Leader;
import java.lang.ref.Reference;
import java.util.Date;

/**
 * Created by Patrick Robichaud on 10/5/2017.
 */

public class Sections implements IRecord {
    public Date GetDate()
    {
        return _date;
    }
    public Book GetBook()
    {
        return _book;
    }
    public Chapter GetChapter()
    {
        return _chapter;
    }
    public Section GetSection()
    {
        return _section;
    }
    public Reference<Leader> GetLeader()
    {
        return _leader;
    }
    public String GetNote()
    {
        return _note;
    }

    public void SetDate(Date date)
    {
        _date = date;
    }
    public void SetBook(Book book)
    {
        _book = book;
    }
    public void SetChapter(Chapter chapter)
    {
        _chapter = chapter;
    }
    public void SetSection(Section section)
    {
        _section = section;
    }
    public void SetLeader(Reference<Leader> leader)
    {
        _leader = leader;
    }
    public void SetNote(String note)
    {
        _note = note;
    }


    private Date _date;
    private Book _book;
    private Chapter _chapter;
    private Section _section;
    private Reference<Leader> _leader;
    private String _note;
}
