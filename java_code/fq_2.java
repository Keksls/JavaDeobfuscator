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
 * Renamed from fQ
 */
public final class fq_2
extends GeneratedMessageV3.Builder<fq_2>
implements fr_2 {
    private int a;
    private List<Integer> b = Collections.emptyList();

    public static final Descriptors.Descriptor a() {
        return fr_1.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.p.ensureFieldAccessorsInitialized(fo_2.class, fq_2.class);
    }

    fq_2() {
        this.j();
    }

    fq_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.j();
    }

    private void j() {
        if (fo_2.j()) {
            // empty if block
        }
    }

    public fq_2 d() {
        super.clear();
        this.b = Collections.emptyList();
        this.a &= 0xFFFFFFFE;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fr_1.o;
    }

    public fo_2 e() {
        return fo_2.g();
    }

    public fo_2 f() {
        fo_2 fo_22 = this.g();
        if (!fo_22.isInitialized()) {
            throw fq_2.newUninitializedMessageException((Message)fo_22);
        }
        return fo_22;
    }

    public fo_2 g() {
        fo_2 fo_22 = new fo_2(this);
        int n = this.a;
        if ((this.a & 1) == 1) {
            this.b = Collections.unmodifiableList(this.b);
            this.a &= 0xFFFFFFFE;
        }
        fo_22.d = this.b;
        this.onBuilt();
        return fo_22;
    }

    public fq_2 h() {
        return (fq_2)super.clone();
    }

    public fq_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fq_2)super.setField(fieldDescriptor, object);
    }

    public fq_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fq_2)super.clearField(fieldDescriptor);
    }

    public fq_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fq_2)super.clearOneof(oneofDescriptor);
    }

    public fq_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fq_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fq_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fq_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public fq_2 a(Message message) {
        if (message instanceof fo_2) {
            return this.a((fo_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fq_2 a(fo_2 fo_22) {
        if (fo_22 == fo_2.g()) {
            return this;
        }
        if (!fo_22.d.isEmpty()) {
            if (this.b.isEmpty()) {
                this.b = fo_22.d;
                this.a &= 0xFFFFFFFE;
            } else {
                this.k();
                this.b.addAll(fo_22.d);
            }
            this.onChanged();
        }
        this.b(fo_2.b(fo_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public fq_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fo_2 fo_22 = null;
        try {
            fo_22 = (fo_2)fo_2.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fo_22 = (fo_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fo_22 != null) {
                this.a(fo_22);
            }
        }
        return this;
    }

    private void k() {
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

    public fq_2 a(int n, int n2) {
        this.k();
        this.b.set(n, n2);
        this.onChanged();
        return this;
    }

    public fq_2 b(int n) {
        this.k();
        this.b.add(n);
        this.onChanged();
        return this;
    }

    public fq_2 a(Iterable<? extends Integer> iterable) {
        this.k();
        AbstractMessageLite.Builder.addAll(iterable, this.b);
        this.onChanged();
        return this;
    }

    public fq_2 i() {
        this.b = Collections.emptyList();
        this.a &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    public final fq_2 a(UnknownFieldSet unknownFieldSet) {
        return (fq_2)super.setUnknownFields(unknownFieldSet);
    }

    public final fq_2 b(UnknownFieldSet unknownFieldSet) {
        return (fq_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.d();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.h();
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
        return this.d();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.h();
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
        return this.h();
    }

    public /* synthetic */ Message buildPartial() {
        return this.g();
    }

    public /* synthetic */ Message build() {
        return this.f();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.h();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.g();
    }

    public /* synthetic */ MessageLite build() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.e();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.e();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.h();
    }

    public /* synthetic */ Object clone() {
        return this.h();
    }
}

