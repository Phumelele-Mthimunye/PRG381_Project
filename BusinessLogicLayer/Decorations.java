package BusinessLogicLayer;
<<<<<<< HEAD:BusinessLogicLayer/Decorations.java
=======

import java.io.FileNotFoundException;
import java.util.List;

import DataAccessLayer.DataHandler;
>>>>>>> 650643f524757923b4beb809fd2dd7ec02511700:DataAccessLayer/Decorations.java

import java.io.FileNotFoundException;
import java.util.List;

import DataAccessLayer.DataHandler;

 
public class Decorations{
<<<<<<< HEAD:BusinessLogicLayer/Decorations.java
    int  DecorID;
=======
    Integer  DecorID;
>>>>>>> 650643f524757923b4beb809fd2dd7ec02511700:DataAccessLayer/Decorations.java
    String Theme;
    String ColorScheme;
    String DecorDescription;

<<<<<<< HEAD:BusinessLogicLayer/Decorations.java
    public int getDecorID()
    {
        return DecorID;
    }
    public void setDecorID(int i)
=======
    public Integer getDecorID()
    {
        return DecorID;
    }
    public void setDecorID(Integer DecorID)
>>>>>>> 650643f524757923b4beb809fd2dd7ec02511700:DataAccessLayer/Decorations.java
    {
        this.DecorID = i;
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

<<<<<<< HEAD:BusinessLogicLayer/Decorations.java
    public Decorations(int DecorID, String Theme, String ColorScheme, String DecorDescription)
=======
    public Decorations(Integer DecorID, String Theme, String ColorScheme, String DecorDescription)
>>>>>>> 650643f524757923b4beb809fd2dd7ec02511700:DataAccessLayer/Decorations.java
    {
        this.DecorID = DecorID;
        this.Theme = Theme;
        this.ColorScheme = ColorScheme;
        this.DecorDescription = DecorDescription;
    }
<<<<<<< HEAD:BusinessLogicLayer/Decorations.java
=======

>>>>>>> 650643f524757923b4beb809fd2dd7ec02511700:DataAccessLayer/Decorations.java
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
<<<<<<< HEAD:BusinessLogicLayer/Decorations.java
=======

>>>>>>> 650643f524757923b4beb809fd2dd7ec02511700:DataAccessLayer/Decorations.java
}