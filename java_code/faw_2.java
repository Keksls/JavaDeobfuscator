/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAw
 */
public class faw_2
extends faj_1 {
    public static final String TAG = "ListCondition";
    public static final String a = "evenIndex";
    public static final String b = "oddIndex";
    public static final String c = "index";
    public static final String m = "tableIndex";
    public static final String n = "nthChild";
    public static final int o = -2034141178;
    public static final int p = 1349330650;
    private int r;
    private int s;

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == -2034141178) {
            this.setNthUnit(Integer.parseInt(fze2.a(string, this.m_elementMap)));
        } else if (n == 1349330650) {
            this.setNthChild(Integer.parseInt(fze2.a(string, this.m_elementMap)));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -2034141178) {
            this.setNthUnit(Integer.parseInt((String)object));
        } else if (n == 1349330650) {
            this.setNthChild(Integer.parseInt((String)object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void copyElement(fyo fyo2) {
        faw_2 faw_22 = (faw_2)fyo2;
        faw_22.r = this.r;
        faw_22.s = this.s;
        super.copyElement(fyo2);
    }

    public void setNthUnit(int n) {
        this.r = n;
    }

    public void setNthChild(int n) {
        this.s = n;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        Object object2;
        ftj_0 ftj_02;
        if (this.g) {
            object = this.f;
        }
        if (object instanceof ftj_0) {
            ftj_02 = (ftj_0)object;
        } else if (object instanceof fyb_0) {
            object2 = (fyb_0)object;
            ftj_02 = ((fyb_0)object2).getRenderableParent();
        } else {
            ftj_02 = this.getParentOfType(ftj_0.class);
        }
        if (ftj_02 == null) {
            return false;
        }
        object2 = ftj_02.getRenderableCollection();
        if (object2 == null) {
            return false;
        }
        if (this.d != null) {
            if (this.d.equalsIgnoreCase(a)) {
                int n = object2.getTableIndex(ftj_02);
                return this.q.isValid(n % 2 == 0);
            }
            if (this.d.equalsIgnoreCase(b)) {
                int n = object2.getTableIndex(ftj_02);
                return this.q.isValid(n % 2 != 0);
            }
            if (this.d.equalsIgnoreCase(c)) {
                int n = object2.getItemIndex(ftj_02.getItemValue());
                return this.q.isValid(n);
            }
            if (this.d.equalsIgnoreCase(m)) {
                int n = object2.getTableIndex(ftj_02);
                return this.q.isValid(n);
            }
            if (this.d.equals(n)) {
                int n = object2.getTableIndex(ftj_02);
                return n % this.r == this.s - 1;
            }
        }
        return false;
    }
}

