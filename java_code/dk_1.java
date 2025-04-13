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

/*
 * Renamed from dK
 */
public final class dk_1
extends GeneratedMessageV3.Builder<dk_1>
implements dq_2 {
    private int a;
    private boolean b;
    private MapField<Integer, dl_1> c;

    public static final Descriptors.Descriptor a() {
        return dn_1.k;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.p();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 2: {
                return this.q();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.l.ensureFieldAccessorsInitialized(di_1.class, dk_1.class);
    }

    dk_1() {
        this.o();
    }

    dk_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (di_1.m()) {
            // empty if block
        }
    }

    public dk_1 g() {
        super.clear();
        this.b = false;
        this.a &= 0xFFFFFFFE;
        this.q().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dn_1.k;
    }

    public di_1 h() {
        return di_1.j();
    }

    public di_1 i() {
        di_1 di_12 = this.j();
        if (!di_12.isInitialized()) {
            throw dk_1.newUninitializedMessageException((Message)di_12);
        }
        return di_12;
    }

    public di_1 j() {
        di_1 di_12 = new di_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        di_12.f = this.b;
        di_12.g = this.p();
        di_12.g.makeImmutable();
        di_12.e = n2;
        this.onBuilt();
        return di_12;
    }

    public dk_1 k() {
        return (dk_1)super.clone();
    }

    public dk_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dk_1)super.setField(fieldDescriptor, object);
    }

    public dk_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dk_1)super.clearField(fieldDescriptor);
    }

    public dk_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dk_1)super.clearOneof(oneofDescriptor);
    }

    public dk_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dk_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dk_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dk_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public dk_1 a(Message message) {
        if (message instanceof di_1) {
            return this.a((di_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dk_1 a(di_1 di_12) {
        if (di_12 == di_1.j()) {
            return this;
        }
        if (di_12.b()) {
            this.a(di_12.c());
        }
        this.q().mergeFrom(di_12.n());
        this.b(di_1.b(di_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        for (dl_1 dl_12 : this.f().values()) {
            if (dl_12.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public dk_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        di_1 di_12 = null;
        try {
            di_12 = (di_1)di_1.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            di_12 = (di_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (di_12 != null) {
                this.a(di_12);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public boolean c() {
        return this.b;
    }

    public dk_1 a(boolean bl) {
        this.a |= 1;
        this.b = bl;
        this.onChanged();
        return this;
    }

    public dk_1 l() {
        this.a &= 0xFFFFFFFE;
        this.b = false;
        this.onChanged();
        return this;
    }

    private MapField<Integer, dl_1> p() {
        if (this.c == null) {
            return MapField.emptyMapField(do_2.a);
        }
        return this.c;
    }

    private MapField<Integer, dl_1> q() {
        this.onChanged();
        if (this.c == null) {
            this.c = MapField.newMapField(do_2.a);
        }
        if (!this.c.isMutable()) {
            this.c = this.c.copy();
        }
        return this.c;
    }

    @Override
    public int d() {
        return this.p().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.p().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dl_1> e() {
        return this.f();
    }

    @Override
    public Map<Integer, dl_1> f() {
        return this.p().getMap();
    }

    @Override
    public dl_1 a(int n, dl_1 dl_12) {
        Map map = this.p().getMap();
        return map.containsKey(n) ? (dl_1)map.get(n) : dl_12;
    }

    @Override
    public dl_1 b(int n) {
        Map map = this.p().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dl_1)map.get(n);
    }

    public dk_1 m() {
        this.q().getMutableMap().clear();
        return this;
    }

    public dk_1 c(int n) {
        this.q().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, dl_1> n() {
        return this.q().getMutableMap();
    }

    public dk_1 b(int n, dl_1 dl_12) {
        if (dl_12 == null) {
            throw new NullPointerException();
        }
        this.q().getMutableMap().put(n, dl_12);
        return this;
    }

    public dk_1 a(Map<Integer, dl_1> map) {
        this.q().getMutableMap().putAll(map);
        return this;
    }

    public final dk_1 a(UnknownFieldSet unknownFieldSet) {
        return (dk_1)super.setUnknownFields(unknownFieldSet);
    }

    public final dk_1 b(UnknownFieldSet unknownFieldSet) {
        return (dk_1)super.mergeUnknownFields(unknownFieldSet);
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

