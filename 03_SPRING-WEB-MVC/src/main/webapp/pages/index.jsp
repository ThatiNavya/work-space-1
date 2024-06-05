<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>ProductData</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="container mt-5">
      <div class="row">
        <div class="col-sm-6 mx-auto">
          <div class="card shadow-lg">
            <div class="card-header bg-danger text-center">
              <h2>Product Form</h2>
            </div>
            <div class="card-body bg-danger-subtle">
              <form:form
                action="product"
                method="POST"
                modelAttribute="product"
              >
                <div class="mb-3">
                  <label class="h5">productId</label>
                  <form:input path="productId" class="form-control" />
                </div>

                <div class="mb-3">
                  <label class="h5">productName</label>
                  <form:input path="productName" class="form-control" />
                </div>
                <div class="mb-4">
                  <label class="h5">productPrice</label>
                  <form:input path="productPrice" class="form-control" />
                </div>
                <div class="d-grid col-12">
                  <input type="submit" value="Submit" class="btn btn-danger" />
                </div>
              </form:form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>