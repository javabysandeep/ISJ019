package _3_classComponents.courseApp;

public class CourseController {
    CourseService courseService = new CourseService();


    public void create() {
        courseService.create();
    }

    public void update() {
        courseService.update();
    }

    public void delete() {
        courseService.delete();
    }

    public void get() {
        courseService.get();
    }
}
