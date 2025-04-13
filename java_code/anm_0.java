/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from anM
 */
class anm_0 {
    private final akx_2 b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    final /* synthetic */ anl_0 a;

    anm_0(anl_0 anl_02, akx_2 akx_22, String string, String string2, String string3, String string4) {
        this.a = anl_02;
        this.d = string;
        this.c = string2;
        this.e = string3;
        this.f = string4;
        this.b = akx_22;
        this.g = "|" + string2 + "|" + string + "|" + string3 + "|" + string4;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public akx_2 e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        anm_0 anm_02 = (anm_0)object;
        return Objects.equals(this.g, anm_02.g);
    }
}

