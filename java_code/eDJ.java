/*
 * Decompiled with CFR 0.152.
 */
class eDJ {
    private final edk_0 a;
    private final int b;

    public String a() {
        if (this.a == edk_0.a) {
            return "effect.description.merged.mastery";
        }
        if (this.a == edk_0.b) {
            return "effect.description.merged.resistance";
        }
        return "";
    }

    public eDJ(edk_0 edk_02, int n) {
        this.a = edk_02;
        this.b = n;
    }

    public edk_0 b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eDJ)) {
            return false;
        }
        eDJ eDJ2 = (eDJ)object;
        if (!eDJ2.a(this)) {
            return false;
        }
        if (this.c() != eDJ2.c()) {
            return false;
        }
        edk_0 edk_02 = this.b();
        edk_0 edk_03 = eDJ2.b();
        return !(edk_02 == null ? edk_03 != null : !((Object)((Object)edk_02)).equals((Object)edk_03));
    }

    protected boolean a(Object object) {
        return object instanceof eDJ;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + this.c();
        edk_0 edk_02 = this.b();
        n2 = n2 * 59 + (edk_02 == null ? 43 : ((Object)((Object)edk_02)).hashCode());
        return n2;
    }
}

