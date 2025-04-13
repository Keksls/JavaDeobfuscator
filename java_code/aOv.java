/*
 * Decompiled with CFR 0.152.
 */
public class aOv
implements agi {
    private static final int a = 3;
    private final aOw b;
    private final aOx c;

    public aOv(aOt aOt2) {
        this.b = new aOw(aOt2);
        this.c = new aOx(aOt2);
    }

    @Override
    public afp_0 a(afj_0 afj_02, int n) {
        if (afj_02.bj()) {
            return this.c;
        }
        return n > 3 ? this.b : this.c;
    }

    @Override
    public void a(afj_0 afj_02) {
    }

    @Override
    public void b(afj_0 afj_02) {
    }

    public String toString() {
        return "MountMovementSelector{, m_mountRunMovementStyle=" + this.b + ", m_mountWalkMovementStyle=" + this.c + "}";
    }
}

