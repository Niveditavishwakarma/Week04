package annotationproblems.exercise.deprecateddemo;

public class Main {
    public static void main(String[] args)
    {
        LegacyAPI legacyapi = new LegacyAPI();
        legacyapi.oldFeature();
        legacyapi.newFeature();
    }
}
