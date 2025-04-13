/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/*
 * Renamed from fIz
 */
public class fiz_2
extends fig_2 {
    public static final String TAG = "SpringLayout";
    public static final String a = "SPL";
    private final HashMap<fvE, ArrayList<fia_1>> b = new HashMap();

    @Override
    public String getTag() {
        return TAG;
    }

    public fia_1 getConstraint(fvE fvE2) {
        ArrayList<fia_1> arrayList = this.b.get(fvE2);
        return arrayList != null && arrayList.size() != 0 ? arrayList.get(0) : null;
    }

    private fvE getWidgetByConstraint(fso fso2, fia_1 fia_12) {
        for (fvE fvE2 : fso2.getWidgetChildren()) {
            fia_1 fia_13;
            if (!(fvE2.getLayoutData() instanceof fia_1) || !(fia_13 = (fia_1)fvE2.getLayoutData()).equals(fia_12)) continue;
            return fvE2;
        }
        return null;
    }

    private void a(ArrayList<fvE> arrayList) {
        Set<fvE> set = this.b.keySet();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            fvE fvE2 = arrayList.get(k);
            if (set.contains(fvE2)) continue;
            this.b.remove(fvE2);
        }
    }

    private void b(fvE fvE2) {
        if (fvE2.getLayoutData() instanceof fia_1) {
            return;
        }
        ArrayList<fia_1> arrayList = this.b.get(fvE2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b.put(fvE2, arrayList);
        }
        if (arrayList.size() == 0) {
            fia_1 fia_12 = fia_1.a(this, fvE2);
            arrayList.add(fia_12);
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public fjf_2 getContentMinSize(fso fso2) {
        this.a(fso2.getWidgetChildren());
        Rectangle rectangle = new Rectangle();
        for (fvE fvE2 : fso2.getWidgetChildren()) {
            fia_1 fia_12 = null;
            this.b(fvE2);
            fia_12 = this.b.get(fvE2).get(0);
            rectangle.union(new Rectangle(fia_12.getX().getValue(), fia_12.getY().getValue(), fia_12.getWidth().getValue(), fia_12.getHeight().getValue()));
        }
        return new fjf_2((int)rectangle.getWidth(), (int)rectangle.getHeight());
    }

    @Override
    public fjf_2 getContentPreferedSize(fso fso2) {
        ArrayList<fvE> arrayList = fso2.getWidgetChildren();
        this.a(arrayList);
        Rectangle rectangle = new Rectangle();
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            fvE fvE2 = arrayList.get(k);
            fia_1 fia_12 = null;
            this.b(fvE2);
            fia_12 = this.b.get(fvE2).get(0);
            rectangle.union(new Rectangle(fia_12.getX().getValue(), fia_12.getY().getValue(), fia_12.getWidth().getValue(), fia_12.getHeight().getValue()));
        }
        return new fjf_2((int)rectangle.getWidth(), (int)rectangle.getHeight());
    }

    public static void a(fso fso2, List<fvE> list) {
    }

    @Override
    public void a(fso fso2) {
        fvE fvE2;
        int n;
        ArrayList<fvE> arrayList = fso2.getWidgetChildren();
        if (arrayList == null) {
            return;
        }
        for (n = arrayList.size() - 1; n >= 0; --n) {
            fvE2 = arrayList.get(n);
            fic_1.b(fso2, fvE2);
            this.b(fvE2);
        }
        for (n = arrayList.size() - 1; n >= 0; --n) {
            fia_1 fia_12;
            fvE2 = arrayList.get(n);
            if (!(fvE2.getLayoutData() instanceof fia_1) || (fia_12 = this.b.get(fvE2).get(0)) == null) continue;
            int n2 = fia_12.getX().getValue();
            int n3 = fia_12.getY().getValue();
            int n4 = fia_12.getWidth().getValue();
            int n5 = fia_12.getHeight().getValue();
            fvE2.setPosition(n2, n3);
            fvE2.setSize(new fjf_2(n4, n5));
        }
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.b.clear();
    }

    public fiz_2 a() {
        fiz_2 fiz_22 = new fiz_2();
        fiz_22.onCheckOut();
        this.copyElement(fiz_22);
        return fiz_22;
    }

    private boolean isFullyDisplayed(fso fso2, fia_1 fia_12) {
        return fia_12.getX().getValue() >= 0 && fia_12.getY().getValue() >= 0 && fia_12.getX().getValue() + fia_12.getWidth().getValue() <= fso2.getWidth() && fia_12.getY().getValue() + fia_12.getHeight().getValue() <= fso2.getHeight();
    }

    public void a(fvE fvE2, fia_1 fia_12) {
        if (fia_12 == null) {
            return;
        }
        ArrayList<fia_1> arrayList = this.b.get(fvE2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b.put(fvE2, arrayList);
        } else {
            arrayList.clear();
        }
        arrayList.add(fia_12);
    }

    public void a(fvE fvE2) {
        this.b.remove(fvE2);
    }

    @Override
    public /* synthetic */ fig_2 d() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.a();
    }
}

