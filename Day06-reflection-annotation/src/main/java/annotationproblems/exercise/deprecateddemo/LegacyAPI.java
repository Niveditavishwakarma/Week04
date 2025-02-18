package annotationproblems.exercise.deprecateddemo;

public class LegacyAPI {
    @Deprecated
    public void oldFeature()
    {
        System.out.println("This is old feature. It is deprecated");
    }
    public void newFeature()
    {
        System.out.println("This is new feature. It is deprecated");
    }
}
