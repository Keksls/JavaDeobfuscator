/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from Yp
 */
public class yp_0<R extends yo_0> {
    protected static final Logger a = Logger.getLogger(yp_0.class);
    protected final HashMap<String, R> b = new HashMap();
    protected final ArrayList<yq_0> c = new ArrayList();
    private final abn_1<R> d;

    protected yp_0(abn_1<R> abn_12) {
        this.d = abn_12;
    }

    public boolean a(yq_0 yq_02) {
        return !this.c.contains(yq_02) && this.c.add(yq_02);
    }

    public boolean b(yq_0 yq_02) {
        return this.c.remove(yq_02);
    }

    public yo_0 a(String string, boolean bl) {
        yo_0 yo_02 = (yo_0)this.b.get(string);
        if (yo_02 == null) {
            yo_02 = (yo_0)this.d.b();
            yo_02.a(string);
            yo_02.a(bl);
            this.b.put(string, yo_02);
        }
        yo_02.a(bl);
        for (yq_0 yq_02 : this.c) {
            yq_02.a(this);
        }
        return yo_02;
    }

    public Collection<R> a() {
        return this.b.values();
    }

    public R a(String string) {
        return (R)((yo_0)this.b.get(string));
    }
}

