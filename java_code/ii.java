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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ii
extends GeneratedMessageV3.Builder<ii>
implements in {
    private int a;
    private List<ij> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<ij, il, im> c;
    private int d;

    public static final Descriptors.Descriptor a() {
        return hR.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hR.b.ensureFieldAccessorsInitialized(ig.class, ii.class);
    }

    ii() {
        this.p();
    }

    ii(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.p();
    }

    private void p() {
        if (ig.m()) {
            this.r();
        }
    }

    public ii g() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        this.d = 0;
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hR.a;
    }

    public ig h() {
        return ig.j();
    }

    public ig i() {
        ig ig2 = this.j();
        if (!ig2.isInitialized()) {
            throw ii.newUninitializedMessageException((Message)ig2);
        }
        return ig2;
    }

    public ig j() {
        ig ig2 = new ig(this);
        int n = this.a;
        int n2 = 0;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            ig2.f = this.b;
        } else {
            ig2.f = this.c.build();
        }
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        ig2.g = this.d;
        ig2.e = n2;
        this.onBuilt();
        return ig2;
    }

    public ii k() {
        return (ii)super.clone();
    }

    public ii a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ii)super.setField(fieldDescriptor, object);
    }

    public ii a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ii)super.clearField(fieldDescriptor);
    }

    public ii a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ii)super.clearOneof(oneofDescriptor);
    }

    public ii a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ii)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ii b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ii)super.addRepeatedField(fieldDescriptor, object);
    }

    public ii a(Message message) {
        if (message instanceof ig) {
            return this.a((ig)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ii a(ig ig2) {
        if (ig2 == ig.j()) {
            return this;
        }
        if (this.c == null) {
            if (!ig2.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = ig2.f;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.q();
                    this.b.addAll(ig2.f);
                }
                this.onChanged();
            }
        } else if (!ig2.f.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = ig2.f;
                this.a &= 0xFFFFFFFE;
                this.c = ig.n() ? this.r() : null;
            } else {
                this.c.addAllMessages(ig2.f);
            }
        }
        if (ig2.e()) {
            this.f(ig2.f());
        }
        this.b(ig.b(ig2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ii a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ig ig2 = null;
        try {
            ig2 = (ig)ig.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ig2 = (ig)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ig2 != null) {
                this.a(ig2);
            }
        }
        return this;
    }

    private void q() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<ij>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<ij> b() {
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
    public ij a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ij)this.c.getMessage(n);
    }

    public ii a(int n, ij ij2) {
        if (this.c == null) {
            if (ij2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.b.set(n, ij2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)ij2);
        }
        return this;
    }

    public ii a(int n, il il2) {
        if (this.c == null) {
            this.q();
            this.b.set(n, il2.h());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)il2.h());
        }
        return this;
    }

    public ii a(ij ij2) {
        if (this.c == null) {
            if (ij2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.b.add(ij2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)ij2);
        }
        return this;
    }

    public ii b(int n, ij ij2) {
        if (this.c == null) {
            if (ij2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.b.add(n, ij2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)ij2);
        }
        return this;
    }

    public ii a(il il2) {
        if (this.c == null) {
            this.q();
            this.b.add(il2.h());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)il2.h());
        }
        return this;
    }

    public ii b(int n, il il2) {
        if (this.c == null) {
            this.q();
            this.b.add(n, il2.h());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)il2.h());
        }
        return this;
    }

    public ii a(Iterable<? extends ij> iterable) {
        if (this.c == null) {
            this.q();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public ii l() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public ii c(int n) {
        if (this.c == null) {
            this.q();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public il d(int n) {
        return (il)this.r().getBuilder(n);
    }

    @Override
    public im b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (im)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends im> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public il m() {
        return (il)this.r().addBuilder((AbstractMessage)ij.i());
    }

    public il e(int n) {
        return (il)this.r().addBuilder(n, (AbstractMessage)ij.i());
    }

    public List<il> n() {
        return this.r().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ij, il, im> r() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public int f() {
        return this.d;
    }

    public ii f(int n) {
        this.a |= 2;
        this.d = n;
        this.onChanged();
        return this;
    }

    public ii o() {
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.onChanged();
        return this;
    }

    public final ii a(UnknownFieldSet unknownFieldSet) {
        return (ii)super.setUnknownFields(unknownFieldSet);
    }

    public final ii b(UnknownFieldSet unknownFieldSet) {
        return (ii)super.mergeUnknownFields(unknownFieldSet);
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

