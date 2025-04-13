/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
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
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Renamed from fH
 */
public final class fh_2
extends GeneratedMessageV3.Builder<fh_2>
implements fj_2 {
    private int a;
    private MapField<Integer, fz_1> b;
    private List<Long> c = Collections.emptyList();

    public static final Descriptors.Descriptor a() {
        return fr_1.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.p();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.q();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.b.ensureFieldAccessorsInitialized(ff_2.class, fh_2.class);
    }

    fh_2() {
        this.o();
    }

    fh_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (ff_2.m()) {
            // empty if block
        }
    }

    public fh_2 g() {
        super.clear();
        this.q().clear();
        this.c = Collections.emptyList();
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fr_1.a;
    }

    public ff_2 h() {
        return ff_2.j();
    }

    public ff_2 i() {
        ff_2 ff_22 = this.j();
        if (!ff_22.isInitialized()) {
            throw fh_2.newUninitializedMessageException((Message)ff_22);
        }
        return ff_22;
    }

    public ff_2 j() {
        ff_2 ff_22 = new ff_2(this);
        int n = this.a;
        ff_22.e = this.p();
        ff_22.e.makeImmutable();
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= 0xFFFFFFFD;
        }
        ff_22.f = this.c;
        this.onBuilt();
        return ff_22;
    }

    public fh_2 k() {
        return (fh_2)super.clone();
    }

    public fh_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fh_2)super.setField(fieldDescriptor, object);
    }

    public fh_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fh_2)super.clearField(fieldDescriptor);
    }

    public fh_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fh_2)super.clearOneof(oneofDescriptor);
    }

    public fh_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fh_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fh_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fh_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fh_2 a(Message message) {
        if (message instanceof ff_2) {
            return this.a((ff_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fh_2 a(ff_2 ff_22) {
        if (ff_22 == ff_2.j()) {
            return this;
        }
        this.q().mergeFrom(ff_22.n());
        if (!ff_22.f.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = ff_22.f;
                this.a &= 0xFFFFFFFD;
            } else {
                this.r();
                this.c.addAll(ff_22.f);
            }
            this.onChanged();
        }
        this.b(ff_2.b(ff_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (fz_1 fz_12 : this.d().values()) {
            if (fz_12.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fh_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ff_2 ff_22 = null;
        try {
            ff_22 = (ff_2)ff_2.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ff_22 = (ff_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ff_22 != null) {
                this.a(ff_22);
            }
        }
        return this;
    }

    private MapField<Integer, fz_1> p() {
        if (this.b == null) {
            return MapField.emptyMapField(fi_2.a);
        }
        return this.b;
    }

    private MapField<Integer, fz_1> q() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(fi_2.a);
        }
        if (!this.b.isMutable()) {
            this.b = this.b.copy();
        }
        return this.b;
    }

    @Override
    public int b() {
        return this.p().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.p().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fz_1> c() {
        return this.d();
    }

    @Override
    public Map<Integer, fz_1> d() {
        return this.p().getMap();
    }

    @Override
    public fz_1 a(int n, fz_1 fz_12) {
        Map map = this.p().getMap();
        return map.containsKey(n) ? (fz_1)map.get(n) : fz_12;
    }

    @Override
    public fz_1 b(int n) {
        Map map = this.p().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fz_1)map.get(n);
    }

    public fh_2 l() {
        this.q().getMutableMap().clear();
        return this;
    }

    public fh_2 d(int n) {
        this.q().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, fz_1> m() {
        return this.q().getMutableMap();
    }

    public fh_2 b(int n, fz_1 fz_12) {
        if (fz_12 == null) {
            throw new NullPointerException();
        }
        this.q().getMutableMap().put(n, fz_12);
        return this;
    }

    public fh_2 a(Map<Integer, fz_1> map) {
        this.q().getMutableMap().putAll(map);
        return this;
    }

    private void r() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<Long>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<Long> e() {
        return Collections.unmodifiableList(this.c);
    }

    @Override
    public int f() {
        return this.c.size();
    }

    @Override
    public long c(int n) {
        return this.c.get(n);
    }

    public fh_2 a(int n, long l) {
        this.r();
        this.c.set(n, l);
        this.onChanged();
        return this;
    }

    public fh_2 a(long l) {
        this.r();
        this.c.add(l);
        this.onChanged();
        return this;
    }

    public fh_2 a(Iterable<? extends Long> iterable) {
        this.r();
        AbstractMessageLite.Builder.addAll(iterable, this.c);
        this.onChanged();
        return this;
    }

    public fh_2 n() {
        this.c = Collections.emptyList();
        this.a &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public final fh_2 a(UnknownFieldSet unknownFieldSet) {
        return (fh_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fh_2 b(UnknownFieldSet unknownFieldSet) {
        return (fh_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

