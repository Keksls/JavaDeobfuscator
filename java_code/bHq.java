/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bHq
implements ajh_1 {
    public static final String a = "element";
    public static final String b = "selected";
    private final box_0 d;
    private boolean e;

    public bHq(box_0 box_02) {
        this.d = box_02;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }

    public void a(boolean bl) {
        this.e = bl;
        fis_1.a().a((ajf_1)this, b);
    }

    public box_0 a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object instanceof efa_0) {
            return object == this.d.b();
        }
        return super.equals(object);
    }
}

