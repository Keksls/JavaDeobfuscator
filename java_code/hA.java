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
import java.util.Map;

public final class hA
extends GeneratedMessageV3.Builder<hA>
implements hC {
    private int a;
    private int b;
    private int c;
    private int d;
    private MapField<Integer, hD> e;

    public static final Descriptors.Descriptor a() {
        return hl_0.i;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 4: {
                return this.v();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 4: {
                return this.w();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.j.ensureFieldAccessorsInitialized(hy_1.class, hA.class);
    }

    hA() {
        this.u();
    }

    hA(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.u();
    }

    private void u() {
        if (hy_1.q()) {
            // empty if block
        }
    }

    public hA k() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.w().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hl_0.i;
    }

    public hy_1 l() {
        return hy_1.n();
    }

    public hy_1 m() {
        hy_1 hy_12 = this.n();
        if (!hy_12.isInitialized()) {
            throw hA.newUninitializedMessageException((Message)hy_12);
        }
        return hy_12;
    }

    public hy_1 n() {
        hy_1 hy_12 = new hy_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        hy_12.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        hy_12.i = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        hy_12.j = this.d;
        hy_12.k = this.v();
        hy_12.k.makeImmutable();
        hy_12.g = n2;
        this.onBuilt();
        return hy_12;
    }

    public hA o() {
        return (hA)super.clone();
    }

    public hA a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hA)super.setField(fieldDescriptor, object);
    }

    public hA a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (hA)super.clearField(fieldDescriptor);
    }

    public hA a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (hA)super.clearOneof(oneofDescriptor);
    }

    public hA a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (hA)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public hA b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (hA)super.addRepeatedField(fieldDescriptor, object);
    }

    public hA a(Message message) {
        if (message instanceof hy_1) {
            return this.a((hy_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public hA a(hy_1 hy_12) {
        if (hy_12 == hy_1.n()) {
            return this;
        }
        if (hy_12.b()) {
            this.c(hy_12.c());
        }
        if (hy_12.d()) {
            this.d(hy_12.e());
        }
        if (hy_12.f()) {
            this.e(hy_12.g());
        }
        this.w().mergeFrom(hy_12.r());
        this.b(hy_1.b(hy_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        for (hD hD2 : this.j().values()) {
            if (hD2.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public hA a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hy_1 hy_12 = null;
        try {
            hy_12 = (hy_1)hy_1.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hy_12 = (hy_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hy_12 != null) {
                this.a(hy_12);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public hA c(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public hA p() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public int e() {
        return this.c;
    }

    public hA d(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public hA q() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public int g() {
        return this.d;
    }

    public hA e(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public hA r() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    private MapField<Integer, hD> v() {
        if (this.e == null) {
            return MapField.emptyMapField(hb_0.a);
        }
        return this.e;
    }

    private MapField<Integer, hD> w() {
        this.onChanged();
        if (this.e == null) {
            this.e = MapField.newMapField(hb_0.a);
        }
        if (!this.e.isMutable()) {
            this.e = this.e.copy();
        }
        return this.e;
    }

    @Override
    public int h() {
        return this.v().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.v().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, hD> i() {
        return this.j();
    }

    @Override
    public Map<Integer, hD> j() {
        return this.v().getMap();
    }

    @Override
    public hD a(int n, hD hD2) {
        Map map = this.v().getMap();
        return map.containsKey(n) ? (hD)map.get(n) : hD2;
    }

    @Override
    public hD b(int n) {
        Map map = this.v().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (hD)map.get(n);
    }

    public hA s() {
        this.w().getMutableMap().clear();
        return this;
    }

    public hA f(int n) {
        this.w().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, hD> t() {
        return this.w().getMutableMap();
    }

    public hA b(int n, hD hD2) {
        if (hD2 == null) {
            throw new NullPointerException();
        }
        this.w().getMutableMap().put(n, hD2);
        return this;
    }

    public hA a(Map<Integer, hD> map) {
        this.w().getMutableMap().putAll(map);
        return this;
    }

    public final hA a(UnknownFieldSet unknownFieldSet) {
        return (hA)super.setUnknownFields(unknownFieldSet);
    }

    public final hA b(UnknownFieldSet unknownFieldSet) {
        return (hA)super.mergeUnknownFields(unknownFieldSet);
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
        return this.k();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.o();
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
        return this.k();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.o();
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
        return this.o();
    }

    public /* synthetic */ Message buildPartial() {
        return this.n();
    }

    public /* synthetic */ Message build() {
        return this.m();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.n();
    }

    public /* synthetic */ MessageLite build() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ Object clone() {
        return this.o();
    }
}

