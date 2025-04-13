/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Emitter;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from aib
 */
class aib_0 {
    private JPanel a;
    private JTable b;
    private JTable c;

    aib_0() {
        this.c();
    }

    private void c() {
        this.a = new JPanel();
        this.a.setLayout(new BorderLayout(0, 0));
        JScrollPane jScrollPane = new JScrollPane();
        this.a.add((Component)jScrollPane, "Center");
        this.c = new JTable();
        jScrollPane.setViewportView(this.c);
        JScrollPane jScrollPane2 = new JScrollPane();
        this.a.add((Component)jScrollPane2, "East");
        this.b = new JTable();
        jScrollPane2.setViewportView(this.b);
    }

    public JComponent a() {
        return this.a;
    }

    public JPanel b() {
        return this.a;
    }

    private void b(ArrayList<ParticleSystem> arrayList, ArrayList<avk_2> arrayList2) {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Id");
        defaultTableModel.addColumn("Class");
        defaultTableModel.addColumn("isAlive");
        defaultTableModel.addColumn("emitters");
        defaultTableModel.addColumn("pos");
        for (ParticleSystem object : arrayList) {
            StringBuilder stringBuilder = new StringBuilder();
            Emitter[] emitterArray = object.ao();
            if (emitterArray != null) {
                int n = emitterArray.length;
                stringBuilder.append("cnt=").append(n).append(" {");
                for (int k = 0; k < n; ++k) {
                    if (k > 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append(emitterArray[k].a());
                }
                stringBuilder.append("}");
            } else {
                stringBuilder.append("cnt=0");
            }
            defaultTableModel.addRow(new Object[]{object.ac(), object.getClass().getSimpleName(), object.an(), stringBuilder, object.e() + ";" + object.f()});
        }
        this.b.setModel(defaultTableModel);
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Id");
        defaultTableModel.addColumn("Pos");
        defaultTableModel.addColumn("Enabled");
        defaultTableModel.addColumn("BaseColor");
        defaultTableModel.addColumn("Range");
        for (avk_2 avk_22 : arrayList2) {
            defaultTableModel.addRow(new Object[]{avk_22.d(), avk_22.c().a() + ";" + avk_22.c().b(), avk_22.b(), avk_22.n(), Float.valueOf(avk_22.m())});
        }
        this.c.setModel(defaultTableModel);
    }

    public void a(ArrayList<ParticleSystem> arrayList, ArrayList<avk_2> arrayList2) {
        this.b(arrayList, arrayList2);
    }
}

