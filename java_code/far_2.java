/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from fAr
 */
public class far_2
extends fyg_0
implements fak_2 {
    public static final String TAG = "Condition";
    private faq_2 g;
    private Object h = true;
    private boolean i;
    private Object j = false;
    private boolean k;
    private boolean l = false;
    private boolean m = false;
    private final Collection<far_2> n = new ArrayList<far_2>();
    protected fal_1 a;
    private boolean o = false;
    public static final int b = 111972721;
    public static final int c = -961646664;
    public static final int d = 2000384720;
    public static final int e = -1451711905;
    public static final int f = 754145004;

    @Override
    public void add(fyb_0 fyb_02) {
        if (fyb_02 instanceof faq_2) {
            this.setCondition((faq_2)fyb_02);
        } else if (fyb_02 instanceof far_2) {
            this.a((far_2)fyb_02);
        }
        super.add(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public Object getResult(Object object) {
        Object object2;
        Iterator<far_2> iterator = this.i || !this.l ? this.h : object;
        Object object3 = object2 = this.k || !this.l ? this.j : object;
        if (this.m) {
            Iterator<far_2> iterator2 = iterator;
            iterator = object2;
            object2 = iterator2;
        }
        if (this.n.isEmpty()) {
            if (this.g == null) {
                m_logger.warn((Object)("Condition sans tests sur " + this.a));
                return iterator;
            }
            return this.g.isValid(object) ? iterator : object2;
        }
        for (far_2 far_22 : this.n) {
            if (!far_22.g.isValid(object)) continue;
            return far_22.isComposite() ? far_22.getResult(object) : far_22.h;
        }
        return object2;
    }

    public faq_2 getCondition() {
        return this.g;
    }

    public void setCondition(faq_2 faq_22) {
        this.g = faq_22;
        if (this.g != null) {
            this.g.setConditionParent(this);
        }
        this.a(true);
    }

    public Object getElseValue() {
        return this.j;
    }

    public void setElseValue(Object object) {
        this.j = object;
        this.k = true;
        if (this.o) {
            this.a(true);
        }
    }

    public void setElseValue(String string) {
        this.setElseValue((Object)string);
    }

    public Object getValue() {
        return this.h;
    }

    public void setValue(Object object) {
        this.h = object;
        this.i = true;
        if (this.o) {
            this.a(true);
        }
    }

    public void setValue(String string) {
        this.setValue((Object)string);
    }

    public boolean isReturnOriginalValue() {
        return this.l;
    }

    public void setReturnOriginalValue(boolean bl) {
        this.l = bl;
        if (this.o) {
            this.a(true);
        }
    }

    public boolean isSwapValueAndElseValue() {
        return this.m;
    }

    public void setSwapValueAndElseValue(boolean bl) {
        this.m = bl;
        if (this.o) {
            this.a(true);
        }
    }

    public boolean isInvalidateConditionOnValueParametersChange() {
        return this.o;
    }

    public void setInvalidateConditionOnValueParametersChange(boolean bl) {
        this.o = bl;
    }

    public void a(boolean bl) {
        if (bl && this.a != null) {
            this.a.a(this);
        }
        this.a();
    }

    public void a() {
        fyb_0 fyb_02 = this.getParent();
        while (fyb_02 instanceof faq_2 || fyb_02 instanceof far_2) {
            fyb_02 = fyb_02.getParent();
        }
        if (fyb_02 instanceof faf_2) {
            faf_2 faf_22 = (faf_2)fyb_02;
            faf_22.getManager().b();
        }
    }

    @Override
    public void setResultProviderParent(fal_1 fal_12) {
        this.a = fal_12;
    }

    public void a(far_2 far_22) {
        this.n.add(far_22);
    }

    public boolean isComposite() {
        return !this.n.isEmpty();
    }

    @Override
    public void copyElement(fyo fyo2) {
        far_2 far_22 = (far_2)fyo2;
        super.copyElement(far_22);
        if (this.i) {
            far_22.setValue(this.h);
        }
        if (this.k) {
            far_22.setElseValue(this.j);
        }
        far_22.l = this.l;
        far_22.m = this.m;
        far_22.o = this.o;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -961646664) {
            this.setElseValue(fze2.a(string, this.m_elementMap));
        } else if (n == 111972721) {
            this.setValue(fze2.a(string, this.m_elementMap));
        } else if (n == 2000384720) {
            this.setReturnOriginalValue(Co.a(string));
        } else if (n == -1451711905) {
            this.setSwapValueAndElseValue(Co.a(string));
        } else if (n == 754145004) {
            this.setInvalidateConditionOnValueParametersChange(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -961646664) {
            this.setElseValue(object);
        } else if (n == 111972721) {
            this.setValue(object);
        } else if (n == 2000384720) {
            this.setReturnOriginalValue(Co.b(object));
        } else if (n == -1451711905) {
            this.setSwapValueAndElseValue(Co.b(object));
        } else if (n == 754145004) {
            this.setInvalidateConditionOnValueParametersChange(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

