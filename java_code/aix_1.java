/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aIx
 */
public class aix_1
implements aiu_1 {
    private final String a;
    private final String b;
    private final aiy_1 c;
    private String d;

    public aix_1(String string, String string2, String string3, aiy_1 aiy_12) {
        this.d = string;
        this.a = string2;
        this.b = string3;
        this.c = aiy_12;
    }

    public aix_1(String string) {
        this.d = string;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override
    public void a(@NotNull ait_1 ait_12) {
        if (ait_12.c() == aiv_1.c) {
            this.d = this.a;
            this.c.a(this.b, ait_12.f());
        }
    }

    public String a() {
        return this.d;
    }
}

