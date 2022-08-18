package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final JwtLibraryAccessors laccForJwtLibraryAccessors = new JwtLibraryAccessors(owner);
    private final MybatisLibraryAccessors laccForMybatisLibraryAccessors = new MybatisLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for lombok (org.projectlombok:lombok)
         * This dependency was declared in settings file 'settings.gradle'
         */
        public Provider<MinimalExternalModuleDependency> getLombok() { return create("lombok"); }

        /**
         * Creates a dependency provider for swagger (io.springfox:springfox-boot-starter)
         * This dependency was declared in settings file 'settings.gradle'
         */
        public Provider<MinimalExternalModuleDependency> getSwagger() { return create("swagger"); }

    /**
     * Returns the group of libraries at jwt
     */
    public JwtLibraryAccessors getJwt() { return laccForJwtLibraryAccessors; }

    /**
     * Returns the group of libraries at mybatis
     */
    public MybatisLibraryAccessors getMybatis() { return laccForMybatisLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    public static class JwtLibraryAccessors extends SubDependencyFactory {

        public JwtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (io.jsonwebtoken:jjwt-api)
             * This dependency was declared in settings file 'settings.gradle'
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("jwt-api"); }

            /**
             * Creates a dependency provider for impl (io.jsonwebtoken:jjwt-impl)
             * This dependency was declared in settings file 'settings.gradle'
             */
            public Provider<MinimalExternalModuleDependency> getImpl() { return create("jwt-impl"); }

            /**
             * Creates a dependency provider for jackson (io.jsonwebtoken:jjwt-jackson)
             * This dependency was declared in settings file 'settings.gradle'
             */
            public Provider<MinimalExternalModuleDependency> getJackson() { return create("jwt-jackson"); }

    }

    public static class MybatisLibraryAccessors extends SubDependencyFactory {

        public MybatisLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plus (com.baomidou:mybatis-plus-boot-starter)
             * This dependency was declared in settings file 'settings.gradle'
             */
            public Provider<MinimalExternalModuleDependency> getPlus() { return create("mybatis-plus"); }

    }

    public static class VersionAccessors extends VersionFactory {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: jwt (0.11.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in settings file 'settings.gradle'
             */
            public Provider<String> getJwt() { return getVersion("jwt"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
