/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class fzz
extends fyg_0 {
    public static final String TAG = "Form";
    private final HashMap<String, fit_1> b = new HashMap();
    private fzA c = null;
    public static final int a = -1421272810;

    @Override
    public void addProperty(fit_1 fit_12) {
        this.a(fit_12.a(), fit_12);
    }

    public void a(String string, fit_1 fit_12) {
        this.b.put(string, fit_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public fit_1 getProperty(String string) {
        return this.b.get(string);
    }

    public Collection<fit_1> getProperties() {
        return this.b.values();
    }

    public Set<String> getPropertyNames() {
        return this.b.keySet();
    }

    public void a() {
        for (fit_1 fit_12 : this.b.values()) {
            fit_12.q();
        }
    }

    @Override
    public boolean isValid() {
        if (this.c != null) {
            Object object = this.c.b();
            return object != null && object instanceof Boolean && (Boolean)object != false;
        }
        return true;
    }

    public void setValidate(fzA fzA2) {
        this.c = fzA2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Form : ");
        for (fit_1 fit_12 : this.b.values()) {
            stringBuilder.append("\n\t").append(fit_12.toString());
        }
        return stringBuilder.toString();
    }

    @Override
    public void onCheckIn() {
        this.m_elementMap.a().a(this);
        super.onCheckIn();
    }

    @Override
    public void copyElement(fyo fyo2) {
        fzz fzz2 = (fzz)fyo2;
        super.copyElement(fzz2);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fze fze2) {
        if (n != -1421272810) {
            return super.setXMLAttribute(n, string, fze2);
        }
        this.setValidate(fze2.a(fzA.class, string));
        return true;
    }

    @Override
    public void preApplyAttributes(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        super.preApplyAttributes(aqx_22, fyb_02, stack, fya_02);
        String string = null;
        aqx_2 aqx_23 = aqx_22.f("id");
        if (aqx_23 != null) {
            string = aqx_23.c();
        } else {
            m_logger.warn((Object)"Attention : l'id du formulaire est nulle.");
        }
        fya_02.a(stack.peek().c() + "." + string, this);
    }

    @Override
    public void postAddChildComputeDocumentEntry(aqx_2 aqx_22, fyb_0 fyb_02, Stack<fyy_0> stack, fya_0 fya_02) {
        super.postAddChildComputeDocumentEntry(aqx_22, fyb_02, stack, fya_02);
        fya_02.f(stack.peek().c() + "." + aqx_22.f("id").c());
    }
}

