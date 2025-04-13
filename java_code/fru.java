/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.xulor2.component.AbstractList;

public class fru
implements adv_1 {
    final /* synthetic */ ftj_0 a;
    final /* synthetic */ Object b;
    final /* synthetic */ AbstractList c;

    public fru(AbstractList abstractList, ftj_0 ftj_02, Object object) {
        this.c = abstractList;
        this.a = ftj_02;
        this.b = object;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        this.a.setContent(this.b);
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

