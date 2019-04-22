package repositories.patients;

import domain.patients.Report;
import factories.patients.ReportFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReportRepositoryTest {


    ReportRepository reportitory;

    @Before
    public void setUp() throws Exception {

        reportitory = ReportRepository.getReportRepository();

    }

    @Test
    public void create() {

        Report report = ReportFactory.getReport(1, "fas", null, null, null);
        reportitory.create(report);
        Assert.assertNotNull(reportitory.getAll());

    }

    @Test
    public void read() {

        Report report = ReportFactory.getReport(1, "fas", null, null, null);
        reportitory.create(report);
        Assert.assertNotNull(reportitory.getAll());

        Report fromSet = reportitory.find(report.getReportId());

        Assert.assertEquals(report, fromSet);


    }

    @Test
    public void update() {


        Report report = ReportFactory.getReport(1, "fas", null, null, null);
        reportitory.create(report);
        Assert.assertNotNull(reportitory.getAll());

        Report update = ReportFactory.getReport(1, "fadass", null, null, null);
        update.setReportId(report.getReportId());
        reportitory.update(update);

        Report updated = reportitory.find(report.getReportId());

        Assert.assertEquals(update, updated);

    }

    @Test
    public void delete() {


        Report report = ReportFactory.getReport(1, "fas", null, null, null);
        reportitory.create(report);
        Assert.assertNotNull(reportitory.getAll());

        reportitory.delete(report);

        Report report1 = reportitory.find(report.getReportId());

        Assert.assertNull(report1);


    }
}