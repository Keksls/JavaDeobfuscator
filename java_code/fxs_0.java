/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fxs
 */
public class fxs_0
extends fyb_0 {
    public static final String TAG = "tableColumn";
    private String h;
    private String i;
    private String j;
    private int k;
    private int l;
    private boolean m;
    private final fag_2 n = new fag_2();
    private boolean o = true;
    private fxt_0 p;
    public static final int a = 3373707;
    public static final int b = 97427706;
    public static final int c = 1662225400;
    public static final int d = -855241956;
    public static final int e = -623419631;
    public static final int f = 1622491524;
    public static final int g = 466743410;

    @Override
    public void add(fyb_0 fyb_02) {
        super.add(fyb_02);
        if (fyb_02 instanceof faf_2) {
            this.n.a((faf_2)fyb_02);
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fag_2 getRendererManager() {
        return this.n;
    }

    public String getName() {
        return this.h;
    }

    public void setName(String string) {
        this.h = string;
    }

    public String getField() {
        return this.i;
    }

    public void setField(String string) {
        this.i = string;
    }

    public boolean getSortable() {
        return this.m;
    }

    public void setSortable(boolean bl) {
        this.m = bl;
    }

    public int getColumnIndex() {
        return this.l;
    }

    public void setColumnIndex(int n) {
        this.l = n;
    }

    public String getColumnId() {
        return this.j;
    }

    public void setColumnId(String string) {
        this.j = string;
    }

    public int getCellWidth() {
        return this.k;
    }

    public void setCellWidth(int n) {
        this.k = n;
    }

    public void setVisible(boolean bl) {
        boolean bl2 = this.o != bl;
        this.o = bl;
        if (bl2 && this.p != null) {
            this.p.a(this, bl);
        }
    }

    public boolean isVisible() {
        return this.o;
    }

    @Override
    public void copyElement(fyo fyo2) {
        super.copyElement(fyo2);
        fxs_0 fxs_02 = (fxs_0)fyo2;
        fxs_02.setName(this.h);
        fxs_02.setField(this.i);
        fxs_02.setSortable(this.m);
        fxs_02.setColumnIndex(this.l);
        fxs_02.setColumnId(this.j);
        fxs_02.setCellWidth(this.k);
        fxs_02.setVisible(this.o);
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.l = -1;
        this.k = 30;
        this.m = true;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 3373707) {
            this.setName(fze2.a(string, this.m_elementMap));
        } else if (n == 97427706) {
            this.setField(string);
        } else if (n == 1662225400) {
            this.setSortable(Co.a(string));
        } else if (n == -855241956) {
            this.setColumnIndex(Co.c(string));
        } else if (n == -623419631) {
            this.setColumnId(string);
        } else if (n == 1622491524) {
            this.setCellWidth(Co.c(string));
        } else if (n == 466743410) {
            this.setVisible(Co.a(string));
        } else {
            return super.setXMLAttribute(n, string, fze2);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3373707) {
            this.setName((String)object);
        } else if (n == 97427706) {
            this.setField((String)object);
        } else if (n == 1662225400) {
            this.setSortable(Co.b(object));
        } else if (n == -855241956) {
            this.setColumnIndex(Co.c(object));
        } else if (n == -623419631) {
            this.setColumnId((String)object);
        } else if (n == 466743410) {
            this.setVisible(Co.b(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    public void setVisibilityListener(fxt_0 fxt_02) {
        this.p = fxt_02;
    }

    public String toString() {
        return "TableColumn{m_name='" + this.h + "', m_columnId='" + this.j + "', m_columnIndex=" + this.l + "}";
    }
}

