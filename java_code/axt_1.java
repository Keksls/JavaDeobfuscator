/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Font;
import java.util.Objects;

/*
 * Renamed from axT
 */
@Deprecated
public class axt_1
implements ayn_2 {
    private final Font f;
    private final boolean g;
    private final ayr_1 h;
    private int i;
    private int j;

    public axt_1(Font font, boolean bl, ayr_1 ayr_12) {
        this.f = font;
        this.g = bl;
        this.h = ayr_12;
    }

    @Override
    public ayn_2 a(int n, float f2, boolean bl) {
        if (!ayq_1.a(bl)) {
            return null;
        }
        Font font = this.f.deriveFont(n, f2);
        axt_1 axt_12 = new axt_1(font, this.g, this.h);
        axt_12.a(this.i, this.j);
        return axt_12;
    }

    @Override
    public float a() {
        return this.f.getSize2D();
    }

    @Override
    public int b() {
        int n = 0;
        if (this.f.isBold()) {
            n |= 1;
        }
        if (this.f.isItalic()) {
            n |= 2;
        }
        return n;
    }

    @Override
    public short c() {
        return 0;
    }

    public final Font d() {
        return this.f;
    }

    public final boolean e() {
        return this.g;
    }

    public ayr_1 f() {
        return this.h;
    }

    @Override
    public void a(int n, int n2) {
        this.i = n;
        this.j = n2;
    }

    public int g() {
        return this.i;
    }

    public int h() {
        return this.j;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        axt_1 axt_12 = (axt_1)object;
        if (this.i != axt_12.i) {
            return false;
        }
        if (this.j != axt_12.j) {
            return false;
        }
        if (this.g != axt_12.g) {
            return false;
        }
        if (this.h != axt_12.h) {
            return false;
        }
        return Objects.equals(this.f, axt_12.f);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f, this.g, this.h, this.i, this.j});
    }
}

