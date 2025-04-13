/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fIM
 */
public class fim_1
extends fyg_0 {
    public static final String TAG = "RadioGroup";
    private ArrayList<ftI> b = new ArrayList();
    private String c;
    public static final int a = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    public String getValue() {
        return this.c;
    }

    public void setValue(String string) {
        this.c = string;
        for (ftI ftI2 : this.b) {
            if (ftI2.getValue() == null || !ftI2.getValue().equalsIgnoreCase(string)) continue;
            ftI2.setSelected(true);
            break;
        }
    }

    public void a(TObjectProcedure<ftI> tObjectProcedure) {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            if (tObjectProcedure.execute((Object)this.b.get(k))) continue;
            return;
        }
    }

    public void a(ftI ftI2) {
        if (!this.b.contains(ftI2)) {
            this.b.add(ftI2);
        }
    }

    public void b(ftI ftI2) {
        this.b.remove(ftI2);
    }

    public void setRadioButtonList(ArrayList<ftI> arrayList) {
        this.b = arrayList;
    }

    @Override
    public void setElementMap(fyy_0 fyy_02) {
        super.setElementMap(fyy_02);
        if (this.m_id != null) {
            this.m_elementMap.a(this.m_id, this);
        }
    }

    @Override
    public void setId(String string) {
        if (this.m_elementMap != null && this.m_elementMap.g(this.m_id)) {
            this.m_elementMap.h(this.m_id);
        }
        super.setId(string);
        if (this.m_elementMap != null) {
            this.m_elementMap.a(this.m_id, this);
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b.clear();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fim_1 fim_12 = (fim_1)fyo2;
        super.copyElement(fim_12);
        fim_12.c = this.c;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n == 111972721) {
            this.setValue(fze2.a(string, this.m_elementMap));
            return true;
        }
        return super.setXMLAttribute(n, string, fze2);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 111972721) {
            this.setValue(String.valueOf(object));
            return true;
        }
        return super.setPropertyAttribute(n, object);
    }
}

