package BusinessLogicLayer;

public class FoodSelection {
    Integer FoodSelID;
    String Courses;
    String MenuDescription;

    public Integer getFoodSelID()
    {
        return FoodSelID;
    }
    public void setFoodSelID(Integer FoodSelID)
    {
        this.FoodSelID = FoodSelID;
    }
    public String getCourses()
    {
        return Courses;
    }
    public void SetCourses(String Courses)
    {
        this.Courses = Courses;
    }
    public String getMenuDescription()
    {
        return MenuDescription;
    }
    public void setMenuDescription(String MenuDescription)
    {
        this.MenuDescription = MenuDescription;
    }

    public FoodSelection()
    {

    }
<<<<<<< HEAD

=======
    
>>>>>>> 650643f524757923b4beb809fd2dd7ec02511700
    public FoodSelection(Integer FoodSelID, String Courses, String MenuDescription)
    {
        this.FoodSelID = FoodSelID;
        this.Courses = Courses;
        this.MenuDescription = MenuDescription;
    }
}
