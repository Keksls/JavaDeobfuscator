/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eNv
 */
class env_2
extends enr_0 {
    private final Long b;

    env_2(epq_2 epq_22) {
        super((byte)0, false, false, 0L);
        this.b = epq_22 == null ? null : Long.valueOf(epq_22.a_());
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public byte e() {
        return -1;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void a(boolean bl) {
        a.error((Object)String.format("[FIGHT] setTeamLeader sur un fighter absent %d - %s", this.b, aho_2.a(10)));
    }

    @Override
    public long i() {
        return 0L;
    }

    @Override
    public Long j() {
        return null;
    }

    @Override
    public void a(Long l, byte by) {
        a.error((Object)String.format("[FIGHT] setCurrentControllerId sur un fighter absent %d - %s", this.b, aho_2.a(10)));
    }

    @Override
    boolean a(enq_0 enq_02) {
        a.error((Object)String.format("[FIGHT] setPlayState sur un fighter absent %d - %s", this.b, aho_2.a(10)));
        return false;
    }

    @Override
    public boolean a(long l) {
        return false;
    }

    @Override
    public boolean b(long l) {
        return false;
    }
}

