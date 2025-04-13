/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class bqT
extends bqN {
    public bqT(bqI bqI2) {
        super(bqI2);
    }

    @Override
    public Object b(String string) {
        if (string.equals("content")) {
            ArrayList<exk_2> arrayList = new ArrayList<exk_2>();
            Iterator<exk_2> iterator = ((bqL)this.a().c()).b().iterator();
            while (iterator.hasNext()) {
                arrayList.add(iterator.next());
            }
            return arrayList;
        }
        if (string.equals("kama")) {
            return this.e();
        }
        if (string.equals("freeBagSlotsSize")) {
            return this.f();
        }
        return super.b(string);
    }

    private int f() {
        tr_0<exk_2> tr_02 = ((bqL)this.a().c()).b();
        return tr_02.k();
    }

    @Override
    protected boolean b() {
        return false;
    }

    @Override
    public void c() {
    }

    @Override
    public long e() {
        return this.a().c().c();
    }
}

