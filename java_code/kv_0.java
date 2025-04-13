/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from kv
 */
public final class kv_0
extends GeneratedMessageV3.Builder<kv_0>
implements kw_0 {
    private int a;
    private Object b = "";
    private long c;
    private long d;

    public static final Descriptors.Descriptor a() {
        return kg.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.j.ensureFieldAccessorsInitialized(kt_0.class, kv_0.class);
    }

    kv_0() {
        this.q();
    }

    kv_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.q();
    }

    private void q() {
        if (kt_0.o()) {
            // empty if block
        }
    }

    public kv_0 i() {
        super.clear();
        this.b = "";
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kg.i;
    }

    public kt_0 j() {
        return kt_0.l();
    }

    public kt_0 k() {
        kt_0 kt_02 = this.l();
        if (!kt_02.isInitialized()) {
            throw kv_0.newUninitializedMessageException((Message)kt_02);
        }
        return kt_02;
    }

    public kt_0 l() {
        kt_0 kt_02 = new kt_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        kt_02.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        kt_02.h = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        kt_02.i = this.d;
        kt_02.f = n2;
        this.onBuilt();
        return kt_02;
    }

    public kv_0 m() {
        return (kv_0)super.clone();
    }

    public kv_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kv_0)super.setField(fieldDescriptor, object);
    }

    public kv_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kv_0)super.clearField(fieldDescriptor);
    }

    public kv_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kv_0)super.clearOneof(oneofDescriptor);
    }

    public kv_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kv_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kv_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kv_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public kv_0 a(Message message) {
        if (message instanceof kt_0) {
            return this.a((kt_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kv_0 a(kt_0 kt_02) {
        if (kt_02 == kt_0.l()) {
            return this;
        }
        if (kt_02.b()) {
            this.a |= 1;
            this.b = kt_02.g;
            this.onChanged();
        }
        if (kt_02.e()) {
            this.a(kt_02.f());
        }
        if (kt_02.g()) {
            this.b(kt_02.h());
        }
        this.b(kt_0.b(kt_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.e()) {
            return false;
        }
        return this.g();
    }

    public kv_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kt_0 kt_02 = null;
        try {
            kt_02 = (kt_0)kt_0.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kt_02 = (kt_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kt_02 != null) {
                this.a(kt_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.b;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.b = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString d() {
        Object object = this.b;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.b = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public kv_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = string;
        this.onChanged();
        return this;
    }

    public kv_0 n() {
        this.a &= 0xFFFFFFFE;
        this.b = kt_0.l().c();
        this.onChanged();
        return this;
    }

    public kv_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = byteString;
        this.onChanged();
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

    public kv_0 a(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public kv_0 o() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public long h() {
        return this.d;
    }

    public kv_0 b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public kv_0 p() {
        this.a &= 0xFFFFFFFB;
        this.d = 0L;
        this.onChanged();
        return this;
    }

    public final kv_0 a(UnknownFieldSet unknownFieldSet) {
        return (kv_0)super.setUnknownFields(unknownFieldSet);
    }

    public final kv_0 b(UnknownFieldSet unknownFieldSet) {
        return (kv_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.i();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.m();
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
        return this.i();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.m();
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
        return this.m();
    }

    public /* synthetic */ Message buildPartial() {
        return this.l();
    }

    public /* synthetic */ Message build() {
        return this.k();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.l();
    }

    public /* synthetic */ MessageLite build() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ Object clone() {
        return this.m();
    }
}

