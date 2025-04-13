/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from QT
 */
public class qt_0
implements qu_0 {
    private static final Logger e = Logger.getLogger(qt_0.class);
    public byte a;
    public byte b;
    public short c;

    public qt_0() {
    }

    public qt_0(qt_0 qt_02) {
        this.a = qt_02.a;
        this.b = qt_02.b;
        this.c = qt_02.c;
    }

    public qt_0(byte by, byte by2, short s2) {
        this.a = by;
        this.b = by2;
        this.c = s2;
        assert (this.a >= 0 && this.a < 18);
        assert (this.b >= 0 && this.b < 18);
    }

    @Override
    public void a(@NotNull arf_1 arf_12) {
        this.a = arf_12.a();
        this.b = arf_12.a();
        this.c = arf_12.b();
        assert (this.a >= 0 && this.a < 18);
        assert (this.b >= 0 && this.b < 18);
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        assert (this.a >= 0 && this.a < 18);
        assert (this.b >= 0 && this.b < 18);
        gk_02.a(this.a);
        gk_02.a(this.b);
        gk_02.a(this.c);
    }

    public String toString() {
        return "ElementDef{m_x=" + this.a + ", m_y=" + this.b + ", m_z=" + this.c + "}";
    }

    public qt_0 a() {
        throw new UnsupportedOperationException("TODO");
    }
}

