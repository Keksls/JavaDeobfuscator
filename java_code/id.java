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

public final class id
extends GeneratedMessageV3.Builder<id>
implements if {
    private int a;
    private MapField<Integer, ig> b;
    private long c;

    public static final Descriptors.Descriptor a() {
        return hR.e;
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
        return hR.f.ensureFieldAccessorsInitialized(ib_0.class, id.class);
    }

    id() {
        this.o();
    }

    id(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (ib_0.m()) {
            // empty if block
        }
    }

    public id g() {
        super.clear();
        this.q().clear();
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hR.e;
    }

    public ib_0 h() {
        return ib_0.j();
    }

    public ib_0 i() {
        ib_0 ib_02 = this.j();
        if (!ib_02.isInitialized()) {
            throw id.newUninitializedMessageException((Message)ib_02);
        }
        return ib_02;
    }

    public ib_0 j() {
        ib_0 ib_02 = new ib_0(this);
        int n = this.a;
        int n2 = 0;
        ib_02.f = this.p();
        ib_02.f.makeImmutable();
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        ib_02.g = this.c;
        ib_02.e = n2;
        this.onBuilt();
        return ib_02;
    }

    public id k() {
        return (id)super.clone();
    }

    public id a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (id)super.setField(fieldDescriptor, object);
    }

    public id a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (id)super.clearField(fieldDescriptor);
    }

    public id a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (id)super.clearOneof(oneofDescriptor);
    }

    public id a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (id)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public id b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (id)super.addRepeatedField(fieldDescriptor, object);
    }

    public id a(Message message) {
        if (message instanceof ib_0) {
            return this.a((ib_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public id a(ib_0 ib_02) {
        if (ib_02 == ib_0.j()) {
            return this;
        }
        this.q().mergeFrom(ib_02.n());
        if (ib_02.e()) {
            this.a(ib_02.f());
        }
        this.b(ib_0.b(ib_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (ig ig2 : this.d().values()) {
            if (ig2.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public id a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ib_0 ib_02 = null;
        try {
            ib_02 = (ib_0)ib_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ib_02 = (ib_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ib_02 != null) {
                this.a(ib_02);
            }
        }
        return this;
    }

    private MapField<Integer, ig> p() {
        if (this.b == null) {
            return MapField.emptyMapField(ie.a);
        }
        return this.b;
    }

    private MapField<Integer, ig> q() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(ie.a);
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
    public Map<Integer, ig> c() {
        return this.d();
    }

    @Override
    public Map<Integer, ig> d() {
        return this.p().getMap();
    }

    @Override
    public ig a(int n, ig ig2) {
        Map map = this.p().getMap();
        return map.containsKey(n) ? (ig)map.get(n) : ig2;
    }

    @Override
    public ig b(int n) {
        Map map = this.p().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (ig)map.get(n);
    }

    public id l() {
        this.q().getMutableMap().clear();
        return this;
    }

    public id c(int n) {
        this.q().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, ig> m() {
        return this.q().getMutableMap();
    }

    public id b(int n, ig ig2) {
        if (ig2 == null) {
            throw new NullPointerException();
        }
        this.q().getMutableMap().put(n, ig2);
        return this;
    }

    public id a(Map<Integer, ig> map) {
        this.q().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public long f() {
        return this.c;
    }

    public id a(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public id n() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    public final id a(UnknownFieldSet unknownFieldSet) {
        return (id)super.setUnknownFields(unknownFieldSet);
    }

    public final id b(UnknownFieldSet unknownFieldSet) {
        return (id)super.mergeUnknownFields(unknownFieldSet);
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

