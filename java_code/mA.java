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

public final class mA
extends GeneratedMessageV3.Builder<mA>
implements mB {
    private int a;
    private long b;
    private Object c = "";
    private int d;
    private int e = -1;

    public static final Descriptors.Descriptor a() {
        return mk.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mk.h.ensureFieldAccessorsInitialized(my_0.class, mA.class);
    }

    mA() {
        this.t();
    }

    mA(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.t();
    }

    private void t() {
        if (my_0.q()) {
            // empty if block
        }
    }

    public mA k() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = -1;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mk.g;
    }

    public my_0 l() {
        return my_0.n();
    }

    public my_0 m() {
        my_0 my_02 = this.n();
        if (!my_02.isInitialized()) {
            throw mA.newUninitializedMessageException((Message)my_02);
        }
        return my_02;
    }

    public my_0 n() {
        my_0 my_02 = new my_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        my_02.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        my_02.i = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        my_02.j = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        my_02.k = this.e;
        my_02.g = n2;
        this.onBuilt();
        return my_02;
    }

    public mA o() {
        return (mA)super.clone();
    }

    public mA a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mA)super.setField(fieldDescriptor, object);
    }

    public mA a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mA)super.clearField(fieldDescriptor);
    }

    public mA a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mA)super.clearOneof(oneofDescriptor);
    }

    public mA a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mA)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mA b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mA)super.addRepeatedField(fieldDescriptor, object);
    }

    public mA a(Message message) {
        if (message instanceof my_0) {
            return this.a((my_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mA a(my_0 my_02) {
        if (my_02 == my_0.n()) {
            return this;
        }
        if (my_02.b()) {
            this.a(my_02.c());
        }
        if (my_02.d()) {
            this.a |= 2;
            this.c = my_02.i;
            this.onChanged();
        }
        if (my_02.g()) {
            this.a(my_02.h());
        }
        if (my_02.i()) {
            this.b(my_02.j());
        }
        this.b(my_0.b(my_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        return this.d();
    }

    public mA a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        my_0 my_02 = null;
        try {
            my_02 = (my_0)my_0.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            my_02 = (my_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (my_02 != null) {
                this.a(my_02);
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

    public mA a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public mA p() {
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

    public mA a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public mA q() {
        this.a &= 0xFFFFFFFD;
        this.c = my_0.n().e();
        this.onChanged();
        return this;
    }

    public mA a(ByteString byteString) {
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

    public mA a(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public mA r() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public int j() {
        return this.e;
    }

    public mA b(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public mA s() {
        this.a &= 0xFFFFFFF7;
        this.e = -1;
        this.onChanged();
        return this;
    }

    public final mA a(UnknownFieldSet unknownFieldSet) {
        return (mA)super.setUnknownFields(unknownFieldSet);
    }

    public final mA b(UnknownFieldSet unknownFieldSet) {
        return (mA)super.mergeUnknownFields(unknownFieldSet);
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

