/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class afs
extends qt_0 {
    private static final Logger g = Logger.getLogger(afs.class);
    alw_1 e;
    int f;

    public afs() {
    }

    public afs(byte by, byte by2, short s2, int n) {
        super(by, by2, s2);
        this.f = n;
    }

    public afs(afs afs2) {
        super(afs2);
        this.f = afs2.f;
    }

    @Override
    public void a(@NotNull arf_1 arf_12) {
        super.a(arf_12);
        this.f = arf_12.c();
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        super.a(gk_02);
        gk_02.a(this.f);
    }

    @Override
    public String toString() {
        return "SoundDef{m_x=" + this.a + ", m_y=" + this.b + ", m_z=" + this.c + "m_soundId=" + this.f + "}";
    }

    public afs b() {
        return new afs(this.a, this.b, this.c, this.f);
    }

    @Override
    public /* synthetic */ qt_0 a() {
        return this.b();
    }
}

