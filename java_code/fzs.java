/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fzs
implements abo_1,
abq_1 {
    private static final Logger i = Logger.getLogger(fzs.class);
    private static final ObjectPool j = new abm_1(new fzt());
    protected ObjectPool a;
    protected boolean b = false;
    protected frd_0 c = null;
    protected boolean d = false;
    protected fyb_0 e;
    protected fyb_0 f;
    @Nullable
    protected fzs g;
    protected final ArrayList<fyb_0> h = new ArrayList();

    public void a(fyb_0 fyb_02) {
        this.h.add(fyb_02);
    }

    public fyb_0 a() {
        int n = this.h.size();
        return n > 0 ? this.h.remove(n - 1) : null;
    }

    public boolean b() {
        return !this.h.isEmpty();
    }

    public boolean c() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public <T extends fyb_0> T d() {
        return (T)this.f;
    }

    public void b(fyb_0 fyb_02) {
        this.f = fyb_02;
    }

    public <T extends fyb_0> T e() {
        return (T)this.e;
    }

    public void c(fyb_0 fyb_02) {
        this.e = fyb_02;
    }

    public frd_0 f() {
        return this.c;
    }

    public void a(frd_0 frd_02) {
        this.c = frd_02;
    }

    public boolean g() {
        return this.d;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    @Nullable
    public fzs h() {
        return this.g;
    }

    public void a(@Nullable fzs fzs2) {
        this.g = fzs2;
    }

    public static fzs i() {
        fzs fzs2;
        try {
            fzs2 = (fzs)j.borrowObject();
            fzs2.a = j;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fzs2 = new fzs();
            fzs2.onCheckOut();
        }
        return fzs2;
    }

    @Override
    public void release() {
        if (this.a == null) {
            this.onCheckIn();
            return;
        }
        try {
            this.a.returnObject((Object)this);
        }
        catch (Exception exception) {
            this.onCheckIn();
        }
    }

    @Override
    public void onCheckIn() {
        this.e = null;
        this.f = null;
        this.h.clear();
        this.a = null;
        this.g = null;
    }

    @Override
    public void onCheckOut() {
        this.d = false;
        this.b = false;
    }

    public String toString() {
        return "Event type=" + this.f();
    }
}

