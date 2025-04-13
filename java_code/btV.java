/*
 * Decompiled with CFR 0.152.
 */
public class btV
implements Uo,
ajh_1 {
    public static final String a = "animName";
    public static final String b = "actorDescriptorLibrary";
    public static final String d = "equipedItem";
    private final bcr_1 e;

    public btV(bcr_1 bcr_12) {
        this.e = bcr_12;
        this.e.a(this);
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.e.ao();
        }
        if (string.equals(b)) {
            return this.e.ar();
        }
        if (string.equals(d)) {
            return this.e.Z();
        }
        return null;
    }

    public bcr_1 a() {
        return this.e;
    }

    @Override
    public void a(Uk uk) {
        fis_1.a().a((ajf_1)this, b, a, d);
    }
}

