/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aMR
 */
public final class amr_2 {
    private static final Logger d = Logger.getLogger(amr_2.class);
    public static final byte a = 1;
    public static final byte b = 2;
    public static final byte c = 3;
    private ArrayList<String> e = new ArrayList(100);
    private ArrayList<String> f = new ArrayList(100);
    private final ArrayList<String> g = new ArrayList(100);

    public amr_2() {
    }

    public amr_2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.e = arrayList;
        this.f = arrayList2;
    }

    public void a(String string, String string2) {
        if (string2.toLowerCase().equals("terminated") && !this.g.contains(string)) {
            this.g.add(string);
        }
        if (string2.toLowerCase().equals("running") && !this.f.contains(string)) {
            this.f.add(string);
        }
        if (string2.toLowerCase().equals("initialized") && !this.e.contains(string)) {
            this.e.add(string);
        }
    }

    public ArrayList<String> a() {
        return this.e;
    }

    public ArrayList<String> b() {
        return this.f;
    }

    public ArrayList<String> c() {
        return this.g;
    }
}

