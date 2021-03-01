package DataAccessLayer;

import java.io.FileNotFoundException;
import java.util.List;

import BusinessLogicLayer.DataHandler;

public class Decorations{
    Integer  DecorID;
    String Theme;
    String ColorScheme;
    String DecorDescription;

    public Integer getDecorID()
    {
        return DecorID;
    }
    public void setDecorID(Integer DecorID)
    {
        this.DecorID = DecorID;
    }
    public String getTheme()
    {
        return Theme;
    }
    public void setTheme(String Theme)
    {
        this.Theme = Theme;
    }
    public String getColorScheme()
    {
        return ColorScheme;
    }
    public void setColorScheme(String ColorScheme)
    {
        this.ColorScheme = ColorScheme;
    }
    public String getDecorDescriptions()
    {
        return DecorDescription;
    }
    public void setDecorDescriptions(String DecorDescription)
    {
        this.DecorDescription = DecorDescription;
    }


    public Decorations()
    {

    }

    public Decorations(Integer DecorID, String Theme, String ColorScheme, String DecorDescription)
    {
        this.DecorID = DecorID;
        this.Theme = Theme;
        this.ColorScheme = ColorScheme;
        this.DecorDescription = DecorDescription;
    }

    public List<Decorations> decorations( ) throws FileNotFoundException{
        DataHandler dh = new DataHandler();
        List<Decorations> dList = dh.GetDecorations();
        if(!dList.isEmpty()){
            return dList;
        }
        else{
            return null;
        }
    }

}