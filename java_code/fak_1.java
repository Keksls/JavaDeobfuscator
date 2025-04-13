/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Objects;

/*
 * Renamed from fAK
 */
public class fak_1
extends fyg_0
implements fak_2 {
    public static final String TAG = "ValueReplacer";
    protected fal_1 a;
    private fre_0 f = null;
    private String g = null;
    private Object h = null;
    private boolean i = false;
    public static final int b = 111972721;
    public static final int c = 106079;
    public static final int d = 1066879900;
    public static final int e = -92096604;

    @Override
    public String getTag() {
        return TAG;
    }

    public fre_0 getKey() {
        return this.f;
    }

    public void setKey(fre_0 fre_02) {
        if (this.f == fre_02) {
            return;
        }
        this.f = fre_02;
        this.b();
    }

    public String getValue() {
        return this.g;
    }

    public void setValue(String string) {
        if (Objects.equals(this.g, string)) {
            return;
        }
        this.g = string;
        this.b();
    }

    public Object getObjectUsed() {
        return this.h;
    }

    public void setObjectUsed(Object object) {
        if (this.h == object) {
            return;
        }
        this.h = object;
        this.b();
    }

    public boolean a() {
        return this.i;
    }

    public void setWhenObjectUsedNotNull(boolean bl) {
        if (this.i == bl) {
            return;
        }
        this.i = bl;
        this.b();
    }

    private void b() {
        if (this.a != null) {
            this.a.a(this);
        }
    }

    @Override
    public void setResultProviderParent(fal_1 fal_12) {
        this.a = fal_12;
    }

    @Override
    public Object getResult(Object object) {
        if (this.f == null) {
            return null;
        }
        boolean bl = this.h != null;
        Object object2 = bl ? this.h : object;
        switch (this.f) {
            case a: {
                if (this.i && !bl) {
                    return 0;
                }
                if (object2 instanceof Collection) {
                    return ((Collection)object2).size();
                }
                if (object2 instanceof Object[]) {
                    return ((Object[])object2).length;
                }
                return 0;
            }
            case b: {
                if (this.g == null || this.i && !bl) {
                    return null;
                }
                return this.g + (object2 != null ? object2.toString() : "");
            }
        }
        return null;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fak_1 fak_12 = (fak_1)fyo2;
        fak_12.setKey(this.f);
        fak_12.setValue(this.g);
        fak_12.setObjectUsed(this.h);
        fak_12.setWhenObjectUsedNotNull(this.i);
        super.copyElement(fak_12);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        switch (n) {
            case 111972721: {
                this.setValue(fze2.a(string, this.m_elementMap));
                return true;
            }
            case 106079: {
                this.setKey(fre_0.a(string));
                return true;
            }
            case 1066879900: {
                this.setObjectUsed(string);
                return true;
            }
            case -92096604: {
                this.setWhenObjectUsedNotNull(Co.a(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 111972721: {
                this.setValue(String.valueOf(object));
                return true;
            }
            case 106079: {
                if (object instanceof fre_0) {
                    this.setKey((fre_0)((Object)object));
                } else {
                    this.setKey(fre_0.a(String.valueOf(object)));
                }
                return true;
            }
            case 1066879900: {
                this.setObjectUsed(object);
                return true;
            }
            case -92096604: {
                this.setWhenObjectUsedNotNull(Co.b(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

