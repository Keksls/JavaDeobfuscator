/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bTD
 */
public class btd_2
implements ajh_1 {
    public static final String a = "isNewEntry";
    private final bue_2 b;
    private cLm d;

    private btd_2(bue_2 bue_22) {
        this.b = bue_22.e();
    }

    public static btd_2 a(bue_2 bue_22) {
        return new btd_2(bue_22);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d.a() == cLn.a;
        }
        return this.b.b(string);
    }

    public String a() {
        return this.b.c();
    }

    public bue_2 b() {
        return this.b;
    }

    public cLm c() {
        return this.d;
    }

    public void a(cLm cLm2) {
        this.d = cLm2;
    }
}

