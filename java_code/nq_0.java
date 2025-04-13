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
 * Renamed from nQ
 */
public final class nq_0
extends GeneratedMessageV3.Builder<nq_0>
implements nr_0 {
    private int a;
    private long b;
    private Object c = "";
    private int d;

    public static final Descriptors.Descriptor a() {
        return ne_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ne_0.d.ensureFieldAccessorsInitialized(no_0.class, nq_0.class);
    }

    nq_0() {
        this.q();
    }

    nq_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.q();
    }

    private void q() {
        if (no_0.o()) {
            // empty if block
        }
    }

    public nq_0 i() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ne_0.c;
    }

    public no_0 j() {
        return no_0.l();
    }

    public no_0 k() {
        no_0 no_02 = this.l();
        if (!no_02.isInitialized()) {
            throw nq_0.newUninitializedMessageException((Message)no_02);
        }
        return no_02;
    }

    public no_0 l() {
        no_0 no_02 = new no_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        no_02.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        no_02.h = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        no_02.i = this.d;
        no_02.f = n2;
        this.onBuilt();
        return no_02;
    }

    public nq_0 m() {
        return (nq_0)super.clone();
    }

    public nq_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nq_0)super.setField(fieldDescriptor, object);
    }

    public nq_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nq_0)super.clearField(fieldDescriptor);
    }

    public nq_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nq_0)super.clearOneof(oneofDescriptor);
    }

    public nq_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nq_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nq_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nq_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public nq_0 a(Message message) {
        if (message instanceof no_0) {
            return this.a((no_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nq_0 a(no_0 no_02) {
        if (no_02 == no_0.l()) {
            return this;
        }
        if (no_02.b()) {
            this.a(no_02.c());
        }
        if (no_02.d()) {
            this.a |= 2;
            this.c = no_02.h;
            this.onChanged();
        }
        if (no_02.g()) {
            this.a(no_02.h());
        }
        this.b(no_0.b(no_02));
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
        return this.g();
    }

    public nq_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        no_0 no_02 = null;
        try {
            no_02 = (no_0)no_0.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            no_02 = (no_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (no_02 != null) {
                this.a(no_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public nq_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public nq_0 n() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.c = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nq_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public nq_0 o() {
        this.a &= 0xFFFFFFFD;
        this.c = no_0.l().e();
        this.onChanged();
        return this;
    }

    public nq_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public int h() {
        return this.d;
    }

    public nq_0 a(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public nq_0 p() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    public final nq_0 a(UnknownFieldSet unknownFieldSet) {
        return (nq_0)super.setUnknownFields(unknownFieldSet);
    }

    public final nq_0 b(UnknownFieldSet unknownFieldSet) {
        return (nq_0)super.mergeUnknownFields(unknownFieldSet);
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

