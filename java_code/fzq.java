/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public abstract class fzq
extends fzr
implements fzu {
    private static final Logger a = Logger.getLogger(fzq.class);
    private fzs b;

    public abstract frd_0 a();

    public Object a(fzs fzs2) {
        this.b = fzs2;
        Object t = fzs2.d();
        if (t != null) {
            super.a(((fyb_0)t).getElementMap());
        }
        return super.b();
    }

    @Override
    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        list.add(this.b.getClass());
        list2.add(this.b);
        super.a(stringArray, list, list2);
    }

    @Override
    public boolean run(fzs fzs2) {
        Object object = this.a(fzs2);
        this.b = null;
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return false;
    }
}

