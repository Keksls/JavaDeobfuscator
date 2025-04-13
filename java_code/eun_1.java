/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUN
 */
public class eun_1
extends evk_1 {
    public static final String a = "elementId";
    public static final String b = "userId";
    private final euq_1[] c;

    public eun_1(int n, ezy_1 ezy_12, int n2, euq_1[] euq_1Array) {
        super(n, 0, ezy_12, n2);
        this.c = euq_1Array;
    }

    public euq_1[] a() {
        return this.c;
    }

    private short f() {
        int n = 0;
        for (euq_1 euq_12 : this.c) {
            n += euq_12.k();
        }
        return (short)n;
    }

    public eup_1 a(short s2) {
        for (euq_1 euq_12 : this.c) {
            for (eup_1 eup_12 : euq_12.h) {
                if (eup_12.b() != s2) continue;
                return eup_12;
            }
        }
        return null;
    }

    public euq_1 b(short s2) {
        for (euq_1 euq_12 : this.c) {
            for (eup_1 eup_12 : euq_12.h) {
                if (eup_12.b() != s2) continue;
                return euq_12;
            }
        }
        return null;
    }

    public Tv d() {
        return Tv.a((short)0);
    }

    public Tv[] e() {
        Tv[] tvArray = new Tv[this.f()];
        System.arraycopy(Tv.values(), 0, tvArray, 0, tvArray.length);
        return tvArray;
    }

    public String toString() {
        return "GenericActivableParameter{} " + super.toString();
    }
}

