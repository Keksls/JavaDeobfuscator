/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from fDg
 */
public class fdg_1
extends fzr {
    private fsv_0 a;
    private fsv_0 b;
    private Object c;
    private Object d;
    private Object l;

    public void b(String string, fyy_0 fyy_02) {
        this.a(string, fyy_02);
    }

    public void a(fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        ftj_0 ftj_02;
        this.l = object;
        this.a = fsv_02;
        this.b = fsv_03;
        if (this.a != null && (ftj_02 = this.a.getRenderableParent()) != null) {
            this.c = ftj_02.getItemValue();
        }
        if (this.b != null && (ftj_02 = this.b.getRenderableParent()) != null) {
            this.d = ftj_02.getItemValue();
        }
    }

    @Override
    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        list.add(fsv_0.class);
        list.add(Object.class);
        list.add(fsv_0.class);
        list.add(Object.class);
        list.add(Object.class);
        list2.add(this.a);
        list2.add(this.c);
        list2.add(this.b);
        list2.add(this.d);
        list2.add(this.l);
        super.a(stringArray, list, list2);
    }

    public void a(fdg_1 fdg_12) {
        fdg_12.b(this.j, this.k);
    }

    public fdg_1 a() {
        fdg_1 fdg_12 = new fdg_1();
        this.a(fdg_12);
        return fdg_12;
    }

    public Object b(fsv_0 fsv_02, fsv_0 fsv_03, Object object) {
        ftj_0 ftj_02;
        this.l = object;
        this.a = fsv_02;
        this.b = fsv_03;
        if (this.a != null && (ftj_02 = this.a.getRenderableParent()) != null) {
            this.c = ftj_02.getItemValue();
        }
        if (this.b != null && (ftj_02 = this.b.getRenderableParent()) != null) {
            this.d = ftj_02.getItemValue();
        }
        return super.b();
    }
}

