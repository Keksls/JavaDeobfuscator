/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abA
 */
public class aba_0 {
    public static final String a = "Anim";
    public static final String b = "-Debut";
    public static final String c = "-Fin";
    public static final String d = "AnimStatique";
    public static final String e = "Course";
    public static final String f = "AnimCourse";
    public static final String g = "AnimSaut";
    public static final String h = "AnimSaut-Marche";
    public static final String i = "AnimSaut-Marche";
    public static final String j = "AnimSaut-Marche";
    public static final String k = "AnimSaut-Marche";
    public static final String l = "AnimSaut-Marche";
    public static final String m = "AnimMarche";
    public static final String n = "AnimHit";
    public static final String o = "AnimHamecon";
    public static final String p = "Accessoire";
    public static final String q = "blason";
    public static final String r = "blason_bg";
    public static final String s = "AnimRelique";
    public static final String t = "AnimRelique-Saut";
    public static final String u = "AnimArtefact-Papatte";
    public static final String v = "AnimArtefact-Nager";
    public static final String w = "AnimArtefact-Nager-Statique";
    public static final String x = "AnimArtefact-Nager-Marche";
    public static final String y = "AnimArtefact-Nager-Debut";
    public static final String z = "AnimArtefact-Nager-Fin";

    public static String a(String string, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int n = stringBuilder.lastIndexOf("-");
        if (n == -1) {
            if (bl) {
                stringBuilder.append(c);
            }
        } else {
            stringBuilder.replace(n, stringBuilder.length(), c);
        }
        return stringBuilder.toString();
    }
}

