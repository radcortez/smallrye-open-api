package io.smallrye.openapi.runtime.scanner;

import org.jboss.jandex.Index;
import org.jboss.jandex.Indexer;
import org.junit.BeforeClass;

/**
 * Base for Vert.x tests. Index the test classes
 * 
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class VertxDataObjectScannerTestBase extends IndexScannerTestBase {

    protected static Index index;

    @BeforeClass
    public static void createIndex() {
        Indexer indexer = new Indexer();

        // Test samples
        indexDirectory(indexer, "test/io/smallrye/openapi/runtime/scanner/entities/");

        index = indexer.complete();
    }

}
