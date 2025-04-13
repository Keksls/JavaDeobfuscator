/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Renamed from fC
 */
public final class fc_2
extends GeneratedMessageV3.Builder<fc_2>
implements fe_2 {
    private int a;
    private List<fk_2> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<fk_2, fm_2, fn_2> c;
    private MapField<Long, fk_2> d;
    private List<Integer> e = Collections.emptyList();
    private MapField<Long, fv_2> f;

    public static final Descriptors.Descriptor a() {
        return fr_1.e;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.C();
            }
            case 4: {
                return this.F();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 2: {
                return this.D();
            }
            case 4: {
                return this.G();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.f.ensureFieldAccessorsInitialized(fz_1.class, fc_2.class);
    }

    fc_2() {
        this.z();
    }

    fc_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.z();
    }

    private void z() {
        if (fz_1.s()) {
            this.B();
        }
    }

    public fc_2 m() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        this.D().clear();
        this.e = Collections.emptyList();
        this.a &= 0xFFFFFFFB;
        this.G().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fr_1.e;
    }

    public fz_1 n() {
        return fz_1.p();
    }

    public fz_1 o() {
        fz_1 fz_12 = this.p();
        if (!fz_12.isInitialized()) {
            throw fc_2.newUninitializedMessageException((Message)fz_12);
        }
        return fz_12;
    }

    public fz_1 p() {
        fz_1 fz_12 = new fz_1(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            fz_12.g = this.b;
        } else {
            fz_12.g = this.c.build();
        }
        fz_12.h = this.C();
        fz_12.h.makeImmutable();
        if ((this.a & 4) == 4) {
            this.e = Collections.unmodifiableList(this.e);
            this.a &= 0xFFFFFFFB;
        }
        fz_12.i = this.e;
        fz_12.k = this.F();
        fz_12.k.makeImmutable();
        this.onBuilt();
        return fz_12;
    }

    public fc_2 q() {
        return (fc_2)super.clone();
    }

    public fc_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fc_2)super.setField(fieldDescriptor, object);
    }

    public fc_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fc_2)super.clearField(fieldDescriptor);
    }

    public fc_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fc_2)super.clearOneof(oneofDescriptor);
    }

    public fc_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fc_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fc_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fc_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fc_2 a(Message message) {
        if (message instanceof fz_1) {
            return this.a((fz_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fc_2 a(fz_1 fz_12) {
        if (fz_12 == fz_1.p()) {
            return this;
        }
        if (this.c == null) {
            if (!fz_12.g.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = fz_12.g;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.A();
                    this.b.addAll(fz_12.g);
                }
                this.onChanged();
            }
        } else if (!fz_12.g.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = fz_12.g;
                this.a &= 0xFFFFFFFE;
                this.c = fz_1.t() ? this.B() : null;
            } else {
                this.c.addAllMessages(fz_12.g);
            }
        }
        this.D().mergeFrom(fz_12.u());
        if (!fz_12.i.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e = fz_12.i;
                this.a &= 0xFFFFFFFB;
            } else {
                this.E();
                this.e.addAll(fz_12.i);
            }
            this.onChanged();
        }
        this.G().mergeFrom(fz_12.v());
        this.b(fz_1.b(fz_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        for (fk_2 generatedMessageV3 : this.g().values()) {
            if (generatedMessageV3.isInitialized()) continue;
            return false;
        }
        for (fv_2 fv_22 : this.l().values()) {
            if (fv_22.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fc_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fz_1 fz_12 = null;
        try {
            fz_12 = (fz_1)fz_1.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fz_12 = (fz_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fz_12 != null) {
                this.a(fz_12);
            }
        }
        return this;
    }

    private void A() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<fk_2>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<fk_2> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public fk_2 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (fk_2)this.c.getMessage(n);
    }

    public fc_2 a(int n, fk_2 fk_22) {
        if (this.c == null) {
            if (fk_22 == null) {
                throw new NullPointerException();
            }
            this.A();
            this.b.set(n, fk_22);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)fk_22);
        }
        return this;
    }

    public fc_2 a(int n, fm_2 fm_22) {
        if (this.c == null) {
            this.A();
            this.b.set(n, fm_22.j());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)fm_22.j());
        }
        return this;
    }

    public fc_2 a(fk_2 fk_22) {
        if (this.c == null) {
            if (fk_22 == null) {
                throw new NullPointerException();
            }
            this.A();
            this.b.add(fk_22);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)fk_22);
        }
        return this;
    }

    public fc_2 b(int n, fk_2 fk_22) {
        if (this.c == null) {
            if (fk_22 == null) {
                throw new NullPointerException();
            }
            this.A();
            this.b.add(n, fk_22);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)fk_22);
        }
        return this;
    }

    public fc_2 a(fm_2 fm_22) {
        if (this.c == null) {
            this.A();
            this.b.add(fm_22.j());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)fm_22.j());
        }
        return this;
    }

    public fc_2 b(int n, fm_2 fm_22) {
        if (this.c == null) {
            this.A();
            this.b.add(n, fm_22.j());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)fm_22.j());
        }
        return this;
    }

    public fc_2 a(Iterable<? extends fk_2> iterable) {
        if (this.c == null) {
            this.A();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public fc_2 r() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public fc_2 d(int n) {
        if (this.c == null) {
            this.A();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public fm_2 e(int n) {
        return (fm_2)this.B().getBuilder(n);
    }

    @Override
    public fn_2 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (fn_2)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fn_2> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public fm_2 s() {
        return (fm_2)this.B().addBuilder((AbstractMessage)fk_2.k());
    }

    public fm_2 f(int n) {
        return (fm_2)this.B().addBuilder(n, (AbstractMessage)fk_2.k());
    }

    public List<fm_2> t() {
        return this.B().getBuilderList();
    }

    private RepeatedFieldBuilderV3<fk_2, fm_2, fn_2> B() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    private MapField<Long, fk_2> C() {
        if (this.d == null) {
            return MapField.emptyMapField(fd_2.a);
        }
        return this.d;
    }

    private MapField<Long, fk_2> D() {
        this.onChanged();
        if (this.d == null) {
            this.d = MapField.newMapField(fd_2.a);
        }
        if (!this.d.isMutable()) {
            this.d = this.d.copy();
        }
        return this.d;
    }

    @Override
    @Deprecated
    public int e() {
        return this.C().getMap().size();
    }

    @Override
    @Deprecated
    public boolean a(long l) {
        return this.C().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, fk_2> f() {
        return this.g();
    }

    @Override
    @Deprecated
    public Map<Long, fk_2> g() {
        return this.C().getMap();
    }

    @Override
    @Deprecated
    public fk_2 a(long l, fk_2 fk_22) {
        Map map = this.C().getMap();
        return map.containsKey(l) ? (fk_2)map.get(l) : fk_22;
    }

    @Override
    @Deprecated
    public fk_2 b(long l) {
        Map map = this.C().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (fk_2)map.get(l);
    }

    @Deprecated
    public fc_2 u() {
        this.D().getMutableMap().clear();
        return this;
    }

    @Deprecated
    public fc_2 e(long l) {
        this.D().getMutableMap().remove(l);
        return this;
    }

    @Deprecated
    public Map<Long, fk_2> v() {
        return this.D().getMutableMap();
    }

    @Deprecated
    public fc_2 b(long l, fk_2 fk_22) {
        if (fk_22 == null) {
            throw new NullPointerException();
        }
        this.D().getMutableMap().put(l, fk_22);
        return this;
    }

    @Deprecated
    public fc_2 a(Map<Long, fk_2> map) {
        this.D().getMutableMap().putAll(map);
        return this;
    }

    private void E() {
        if ((this.a & 4) != 4) {
            this.e = new ArrayList<Integer>(this.e);
            this.a |= 4;
        }
    }

    @Override
    public List<Integer> h() {
        return Collections.unmodifiableList(this.e);
    }

    @Override
    public int i() {
        return this.e.size();
    }

    @Override
    public int c(int n) {
        return this.e.get(n);
    }

    public fc_2 a(int n, int n2) {
        this.E();
        this.e.set(n, n2);
        this.onChanged();
        return this;
    }

    public fc_2 g(int n) {
        this.E();
        this.e.add(n);
        this.onChanged();
        return this;
    }

    public fc_2 b(Iterable<? extends Integer> iterable) {
        this.E();
        AbstractMessageLite.Builder.addAll(iterable, this.e);
        this.onChanged();
        return this;
    }

    public fc_2 w() {
        this.e = Collections.emptyList();
        this.a &= 0xFFFFFFFB;
        this.onChanged();
        return this;
    }

    private MapField<Long, fv_2> F() {
        if (this.f == null) {
            return MapField.emptyMapField(fb_2.a);
        }
        return this.f;
    }

    private MapField<Long, fv_2> G() {
        this.onChanged();
        if (this.f == null) {
            this.f = MapField.newMapField(fb_2.a);
        }
        if (!this.f.isMutable()) {
            this.f = this.f.copy();
        }
        return this.f;
    }

    @Override
    public int j() {
        return this.F().getMap().size();
    }

    @Override
    public boolean c(long l) {
        return this.F().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, fv_2> k() {
        return this.l();
    }

    @Override
    public Map<Long, fv_2> l() {
        return this.F().getMap();
    }

    @Override
    public fv_2 a(long l, fv_2 fv_22) {
        Map map = this.F().getMap();
        return map.containsKey(l) ? (fv_2)map.get(l) : fv_22;
    }

    @Override
    public fv_2 d(long l) {
        Map map = this.F().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (fv_2)map.get(l);
    }

    public fc_2 x() {
        this.G().getMutableMap().clear();
        return this;
    }

    public fc_2 f(long l) {
        this.G().getMutableMap().remove(l);
        return this;
    }

    @Deprecated
    public Map<Long, fv_2> y() {
        return this.G().getMutableMap();
    }

    public fc_2 b(long l, fv_2 fv_22) {
        if (fv_22 == null) {
            throw new NullPointerException();
        }
        this.G().getMutableMap().put(l, fv_22);
        return this;
    }

    public fc_2 b(Map<Long, fv_2> map) {
        this.G().getMutableMap().putAll(map);
        return this;
    }

    public final fc_2 a(UnknownFieldSet unknownFieldSet) {
        return (fc_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fc_2 b(UnknownFieldSet unknownFieldSet) {
        return (fc_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.m();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.q();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.m();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Message buildPartial() {
        return this.p();
    }

    public /* synthetic */ Message build() {
        return this.o();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.p();
    }

    public /* synthetic */ MessageLite build() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.q();
    }

    public /* synthetic */ Object clone() {
        return this.q();
    }
}

