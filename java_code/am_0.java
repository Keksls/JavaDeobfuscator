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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from AM
 */
public final class am_0
extends GeneratedMessageV3.Builder<am_0>
implements an_0 {
    private int a;
    private List<Integer> b = Collections.emptyList();
    private List<Integer> c = Collections.emptyList();

    public static final Descriptors.Descriptor a() {
        return ai_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ai_0.b.ensureFieldAccessorsInitialized(ak_0.class, am_0.class);
    }

    am_0() {
        this.m();
    }

    am_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (ak_0.l()) {
            // empty if block
        }
    }

    public am_0 f() {
        super.clear();
        this.b = Collections.emptyList();
        this.a &= 0xFFFFFFFE;
        this.c = Collections.emptyList();
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ai_0.a;
    }

    public ak_0 g() {
        return ak_0.i();
    }

    public ak_0 h() {
        ak_0 ak_02 = this.i();
        if (!ak_02.isInitialized()) {
            throw am_0.newUninitializedMessageException((Message)ak_02);
        }
        return ak_02;
    }

    public ak_0 i() {
        ak_0 ak_02 = new ak_0(this);
        int n = this.a;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= 0xFFFFFFFE;
        }
        ak_02.e = this.b;
        if ((this.a & 2) == 2) {
            this.c = Collections.unmodifiableList(this.c);
            this.a &= 0xFFFFFFFD;
        }
        ak_02.f = this.c;
        this.onBuilt();
        return ak_02;
    }

    public am_0 j() {
        return (am_0)super.clone();
    }

    public am_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (am_0)super.setField(fieldDescriptor, object);
    }

    public am_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (am_0)super.clearField(fieldDescriptor);
    }

    public am_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (am_0)super.clearOneof(oneofDescriptor);
    }

    public am_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (am_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public am_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (am_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public am_0 a(Message message) {
        if (message instanceof ak_0) {
            return this.a((ak_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public am_0 a(ak_0 ak_02) {
        if (ak_02 == ak_0.i()) {
            return this;
        }
        if (!ak_02.e.isEmpty()) {
            if (this.b.isEmpty()) {
                this.b = ak_02.e;
                this.a &= 0xFFFFFFFE;
            } else {
                this.n();
                this.b.addAll(ak_02.e);
            }
            this.onChanged();
        }
        if (!ak_02.f.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c = ak_02.f;
                this.a &= 0xFFFFFFFD;
            } else {
                this.o();
                this.c.addAll(ak_02.f);
            }
            this.onChanged();
        }
        this.b(ak_0.b(ak_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public am_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ak_0 ak_02 = null;
        try {
            ak_02 = (ak_0)ak_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ak_02 = (ak_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ak_02 != null) {
                this.a(ak_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<Integer>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<Integer> b() {
        return Collections.unmodifiableList(this.b);
    }

    @Override
    public int c() {
        return this.b.size();
    }

    @Override
    public int a(int n) {
        return this.b.get(n);
    }

    public am_0 a(int n, int n2) {
        this.n();
        this.b.set(n, n2);
        this.onChanged();
        return this;
    }

    public am_0 c(int n) {
        this.n();
        this.b.add(n);
        this.onChanged();
        return this;
    }

    public am_0 a(Iterable<? extends Integer> iterable) {
        this.n();
        AbstractMessageLite.Builder.addAll(iterable, this.b);
        this.onChanged();
        return this;
    }

    public am_0 k() {
        this.b = Collections.emptyList();
        this.a &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    private void o() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<Integer>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<Integer> d() {
        return Collections.unmodifiableList(this.c);
    }

    @Override
    public int e() {
        return this.c.size();
    }

    @Override
    public int b(int n) {
        return this.c.get(n);
    }

    public am_0 b(int n, int n2) {
        this.o();
        this.c.set(n, n2);
        this.onChanged();
        return this;
    }

    public am_0 d(int n) {
        this.o();
        this.c.add(n);
        this.onChanged();
        return this;
    }

    public am_0 b(Iterable<? extends Integer> iterable) {
        this.o();
        AbstractMessageLite.Builder.addAll(iterable, this.c);
        this.onChanged();
        return this;
    }

    public am_0 l() {
        this.c = Collections.emptyList();
        this.a &= 0xFFFFFFFD;
        this.onChanged();
        return this;
    }

    public final am_0 a(UnknownFieldSet unknownFieldSet) {
        return (am_0)super.setUnknownFields(unknownFieldSet);
    }

    public final am_0 b(UnknownFieldSet unknownFieldSet) {
        return (am_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

