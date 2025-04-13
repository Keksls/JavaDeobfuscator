/*
 * Decompiled with CFR 0.152.
 */
class dbr
implements fzu {
    final /* synthetic */ fso a;
    final /* synthetic */ dbp b;

    dbr(dbp dbp2, fso fso2) {
        this.b = dbp2;
        this.a = fso2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.getX() <= 0) {
            return false;
        }
        this.b.r = true;
        while (!this.b.i.isEmpty() && this.b.j.size() < 9) {
            this.b.b(this.b.i.removeLast());
        }
        this.a.removeEventListener(frd_0.Q, this, true);
        this.a.setEnablePositionEvents(false);
        this.a.setVisible(false);
        return true;
    }
}

