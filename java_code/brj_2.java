/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRj
 */
public class brj_2
implements ajh_1 {
    public static final String a = "name";
    final bri_2 b;
    private ArrayList<brg_2> d = new ArrayList();

    public brj_2(bri_2 bri_22, ArrayList<brg_2> arrayList) {
        this.b = bri_22;
        this.d = arrayList;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        return null;
    }

    public String a() {
        return this.b.c();
    }

    public ArrayList<brg_2> b() {
        return this.d;
    }
}

