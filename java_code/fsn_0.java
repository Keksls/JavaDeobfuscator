/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from fsN
 */
public class fsn_0
extends fso {
    private static final Logger k = Logger.getLogger(fsn_0.class);
    public static final String TAG = "LayeredContainer";
    public static final int a = -40000;
    public static final int b = -39999;
    public static final int c = -30000;
    public static final int d = -10000;
    public static final int e = 25000;
    public static final int f = 26000;
    public static final int g = 27000;
    public static final int h = 30000;
    public static final int i = 40000;
    public static final int j = Integer.MIN_VALUE;
    final TIntArrayList l = new TIntArrayList();

    public void a(fvE fvE2, int n) {
        this.a(fvE2, n, Integer.MAX_VALUE);
    }

    public void a(fvE fvE2, int n, int n2) {
        if (!this.m_unloading) {
            fso fso2 = this.getContainerFromLayer(n);
            if (fso2 == null) {
                fso2 = this.a(n);
            }
            int n3 = Math.min(fso2.getWidgetChildren().size(), n2);
            fso2.add(fvE2, n3);
        }
    }

    private fso a(int n) {
        int n2;
        fso fso2 = fso.checkOut();
        fso2.setSize(this.getWidth(), this.getHeight());
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(100.0f, 100.0f));
        fso2.add(fid_12);
        fic_1 fic_12 = new fic_1();
        fic_12.setAdaptToContentSize(true);
        fic_12.onCheckOut();
        fso2.add(fic_12);
        int n3 = this.m_widgetChildren.size();
        for (n2 = 0; n2 < n3 && this.l.get(n2) <= n; ++n2) {
        }
        this.l.insert(n2, n);
        this.add(fso2, n2);
        return fso2;
    }

    @Override
    public void remove(fyb_0 fyb_02) {
        int n;
        if (fyb_02 instanceof fso && (n = this.m_widgetChildren.indexOf(fyb_02)) != -1) {
            this.l.removeAt(n);
        }
        super.remove(fyb_02);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getLayer(fvE fvE2) {
        int n = this.m_widgetChildren.size();
        for (int k = 0; k < n; ++k) {
            fso fso2 = (fso)this.m_widgetChildren.get(k);
            if (!fso2.getWidgetChildren().contains(fvE2)) continue;
            return this.l.get(k);
        }
        return Integer.MIN_VALUE;
    }

    public int getWidgetCountInLayer(int n) {
        fso fso2 = this.getContainerFromLayer(n);
        if (fso2 != null) {
            return fso2.getWidgetChildren().size();
        }
        return 0;
    }

    public fso getContainerFromLayer(int n) {
        int n2 = this.l.indexOf(n);
        if (n2 != -1) {
            return (fso)this.m_widgetChildren.get(n2);
        }
        return null;
    }

    public fso getContainerFromWidget(fvE fvE2) {
        int n = this.m_widgetChildren.size();
        for (int k = 0; k < n; ++k) {
            fso fso2 = (fso)this.m_widgetChildren.get(k);
            if (!fso2.getWidgetChildren().contains(fvE2)) continue;
            return fso2;
        }
        return null;
    }

    public void a(TObjectProcedure<fvE> tObjectProcedure, int ... nArray) {
        for (int n : nArray) {
            tObjectProcedure.execute((Object)this.getContainerFromLayer(n));
        }
    }

    public void b(TObjectProcedure<fvE> tObjectProcedure, int ... nArray) {
        if (!this.l.isEmpty()) {
            this.l.forEach((TIntProcedure)new fso_0(this, nArray, tObjectProcedure));
        }
    }

    public void a(fvE fvE2) {
        fso fso2;
        int n = this.getLayer(fvE2);
        if (n != Integer.MIN_VALUE && (fso2 = this.getContainerFromLayer(n)) != null) {
            fso2.getWidgetChildren().remove(fvE2);
            fso2.getWidgetChildren().add(fvE2);
            fso2.setNeedsToResetMeshes();
        }
    }

    public int getWidgetPositionInLayer(fvE fvE2) {
        fso fso2;
        int n = this.getLayer(fvE2);
        if (n != Integer.MIN_VALUE && (fso2 = this.getContainerFromLayer(n)) != null) {
            return fso2.getWidgetChildren().indexOf(fvE2);
        }
        return -1;
    }

    public void setWidgetPositionInLayer(fvE fvE2, int n) {
        fso fso2;
        if (n < 0) {
            k.warn((Object)"on essaye de set la position d'un widget dans un layer \u00e0 une position inf\u00e9rieure \u00e0 0");
            return;
        }
        int n2 = this.getLayer(fvE2);
        if (n2 != Integer.MIN_VALUE && (fso2 = this.getContainerFromLayer(n2)) != null) {
            ArrayList<fvE> arrayList = fso2.getWidgetChildren();
            if (n >= arrayList.size()) {
                k.warn((Object)"on essaye de set la position d'un widget dans un layer \u00e0 une position trop grande");
                return;
            }
            arrayList.remove(fvE2);
            arrayList.add(n, fvE2);
            fso2.setNeedsToResetMeshes();
        }
    }

    public Iterator<fvE> getAllWidgetIterator() {
        return new fsP(this);
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        this.add(fic_12);
    }
}

