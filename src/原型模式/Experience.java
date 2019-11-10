package 原型模式;

import java.util.Date;

public class Experience  {
    Date date;
    String companyname;

    public Experience(Date date, String companyname) {
        this.date = date;
        this.companyname = companyname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return  new Experience(date,companyname);

    }
}
